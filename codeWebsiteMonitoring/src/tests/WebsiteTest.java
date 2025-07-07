package tests;


import codeWebsiteMonitoring.Website;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WebsiteTest {
    
    @Test
    void testGetWebsiteUrl() {
        Website website = new Website(1, "https://example.com");
        assertEquals("https://example.com", website.getWebsiteUrl());
    }

    @Test
    void testCheckUpdates() {
        Website website = new Website(2, "https://example.com");
        assertTrue(website.checkupdates());
    }
}
