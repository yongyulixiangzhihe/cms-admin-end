package diamond.cms.server.mvc.controllers;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletResponse;

import diamond.cms.server.BasicWebTest;

public class ArticleControllerTest extends BasicWebTest{

    @Override
    protected String getUrl() {
        return "/article";
    }

    @Test
    public void findTest() throws Exception {
        MockHttpServletResponse response = perform(get(getUrl()).param("pageSize", "1").param("currentPage", "1"));
        asserts(response);
    }


}
