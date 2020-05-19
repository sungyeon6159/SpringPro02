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
public class TestControllerWeb {

	private final Logger  LOG = LoggerFactory.getLogger(TestControllerWeb.class);

	@Autowired
	WebApplicationContext  webApplicationContext;

	private List<SkillVO> skills;

	@Autowired
	SkillService  skillService;

	//브라우저 대신 Mock
	private MockMvc mockMvc;


	@Before
	public void setUp() {
		LOG.debug("*********************");
		LOG.debug("=setUp()=");
		LOG.debug("*********************");
		skills = Arrays.asList(
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
	public void doSelectOne() throws Exception {
		//url+param
		MockHttpServletRequestBuilder  createMesage
		           = MockMvcRequestBuilders.post("/skill/do_select_one.do")
		             .param("memberId", skills.get(1).getMemberId()) 
		             .param("sName", skills.get(1).getsName());
		            

		//MediaType.APPLICATION_JSON_UTF8 ==application/json;charset=UTF-8
		ResultActions  resultActions = mockMvc.perform(createMesage)
			.andExpect(status().is2xxSuccessful())
			.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.sName", is(skills.get(1).getsName())))
		    .andExpect(MockMvcResultMatchers.jsonPath("$.sMarstery", is(skills.get(1).getsMarstery())))
		    ;

		String result = resultActions.andDo(print())
				.andReturn()
				.getResponse().getContentAsString();
		LOG.debug("=====================");
		LOG.debug("=result="+result);
		LOG.debug("=====================");


	}

	@Test
	public void doDelete() throws Exception {
		//url+param
		MockHttpServletRequestBuilder  createMesage
		           = MockMvcRequestBuilders.post ("/skill/do_delete.do")
		        		   .param("memberId", skills.get(0).getMemberId()) 
				             .param("sName", skills.get(0).getsName());
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
