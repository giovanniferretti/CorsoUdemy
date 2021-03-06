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
import java.util.concurrent.Callable;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author giovanni
 */
public class GetSitePageExecutor implements Callable<String> {

    private String url;

    public GetSitePageExecutor(String url) {
        this.url = url;
    }

    @Override
    public String call() {
        try {
            URL u = new URL(url);
            URLConnection con = u.openConnection();
            InputStream is = con.getInputStream();
            Charset cs = null;

            return IOUtils.toString(is, cs);
        } catch (MalformedURLException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }

        return null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
