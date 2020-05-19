package com.sist.spring.portfolio.skill;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;





@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		                           "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
                                   })
public class TestSkillControllerWeb {

	private final Logger  LOG = LoggerFactory.getLogger(TestSkillControllerWeb.class);

	@Autowired
	WebApplicationContext  webApplicationContext;

	private List<SkillVO> skillsList;

	@Autowired
	SkillService  skillService;
	
	@Autowired
	SkillDaoImple  dao;

	//브라우저 대신 Mock
	private MockMvc mockMvc;


	@Before
	public void setUp() {
		LOG.debug("*********************");
		LOG.debug("=setUp()=");
		LOG.debug("*********************");
		skillsList = Arrays.asList(
					 new SkillVO("Oracle",	"j_hr001",	90	,"내용001")
					,new SkillVO("JAVA",	"j_hr002",	81	,"내용002")
					,new SkillVO("CSS",	"j_hr003",	50	,"내용003")
					,new SkillVO("Spring",	"j_hr001",	70	,"내용004")                                    
				);              

		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		LOG.debug("=====================");
		LOG.debug("=webApplicationContext="+webApplicationContext);
		LOG.debug("=mockMvc="+mockMvc);
		LOG.debug("=userService="+skillService);
		LOG.debug("=====================");

	}

	//단건조회
	@Test
	@Ignore
	public void doSelectOne() throws Exception {
		//url+param
		MockHttpServletRequestBuilder  createMesage
		           = MockMvcRequestBuilders.post("/skill/do_select_one.spring")
		             .param("memberId", skillsList.get(1).getMemberId()) 
		             .param("sName", skillsList.get(1).getsName());
		            

		//MediaType.APPLICATION_JSON_UTF8 ==application/json;charset=UTF-8
		ResultActions  resultActions = mockMvc.perform(createMesage)
			.andExpect(status().is2xxSuccessful())
			.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.sName", is(skillsList.get(1).getsName())))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.sMarstery", is(skillsList.get(1).getsMarstery())))
		    ;

		String result = resultActions.andDo(print())
				.andReturn()
				.getResponse().getContentAsString();
		LOG.debug("=====================");
		LOG.debug("=result="+result);
		LOG.debug("=====================");


	}

	@Test
	@Ignore
	public void doDelete() throws Exception {
		//url+param
		MockHttpServletRequestBuilder  createMesage
		           = MockMvcRequestBuilders.post ("/skill/do_delete.spring")
		        		   .param("memberId", skillsList.get(0).getMemberId()) 
				             .param("sName", skillsList.get(0).getsName());
		//MediaType.APPLICATION_JSON_UTF8 ==application/json;charset=UTF-8
		ResultActions  resultActions = mockMvc.perform(createMesage)
			.andExpect(status().is2xxSuccessful())
			.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.msgId", is("1")
		    		));

		String result = resultActions.andDo(print())
				.andReturn()
				.getResponse().getContentAsString();
		LOG.debug("=====================");
		LOG.debug("=result="+result);
		LOG.debug("=====================");

	}
	
	@Test
	public void doUpdate() throws Exception {
		
		//2.단건입력
		//3.단건조회
		//3.1.단건수정
		//4.수정
		//5.수정데이터 조회
		//6.비교 
	
		int flag = dao.doInsert(skillsList.get(0));
		assertThat(flag, is(1));
		
		SkillVO skillVO = (SkillVO) dao.doSelectOne(skillsList.get(0));
		LOG.debug("=====================");
		LOG.debug("=skillVO="+skillVO);
		LOG.debug("=====================");  
		
	
		//url+param
		MockHttpServletRequestBuilder  createMesage 
		           = MockMvcRequestBuilders.post ("/skill/do_update.spring")
		        		   .param("memberId", skillsList.get(0).getMemberId()) 
				             .param("sName", skillsList.get(0).getsName())
				             .param("sMarstery", Integer.toString(skillsList.get(0).getsMarstery()))
				             .param("sContent", skillsList.get(0).getsContent()+"_UU")
				             
				             ;
		
		
		ResultActions  resultActions = mockMvc.perform(createMesage)
			.andExpect(status().is2xxSuccessful())
			.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.msgId", is("1")));
			;
		
		String result = resultActions.andDo(print())
				.andReturn()
				.getResponse().getContentAsString();
		LOG.debug("=====================");
		LOG.debug("=result="+result);
		LOG.debug("=====================");  		
				
		//5.수정데이터 조회
		SkillVO vsVO = (SkillVO) dao.doSelectOne(skillVO);
		LOG.debug("=vsVO="+vsVO);
		LOG.debug("=skillVO="+skillVO);
	}
	
	
	


	@Test
	public void test() {
		LOG.debug("=====================");
		LOG.debug("=test()=");
		LOG.debug("=====================");


		LOG.debug("=====================");
		LOG.debug("=userService="+skillService);
		LOG.debug("=====================");

		assertThat(1, is(1));

	}


}
