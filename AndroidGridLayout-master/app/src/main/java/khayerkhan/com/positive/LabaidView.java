package khayerkhan.com.positive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import edmt.dev.androidgridlayout.R;

public class LabaidView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labaid_view);

        Intent intent=getIntent();

        String s2= intent.getExtras().getString("Q");


        try {
            WebView webView = null;
            webView = (WebView) findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("file:///android_asset/"+s2);
        } catch (Exception e) {
            // TODO: handle exception
            this.finish();
        }


    }
}
