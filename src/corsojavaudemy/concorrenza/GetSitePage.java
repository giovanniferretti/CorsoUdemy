/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author giovanni
 */
public class GetSitePage extends Thread {

    private String url;
    private String content;

    public GetSitePage(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void run() {
        try {
            URL u = new URL(url);

            URLConnection con = u.openConnection();

            InputStream is = con.getInputStream();
            
            Charset cs = null;
            
            setContent(IOUtils.toString(is, cs));
        } catch (MalformedURLException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

}
