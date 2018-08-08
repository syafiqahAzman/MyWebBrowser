package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLoadUrl;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadUrl = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        //set this to the webView
        wvMyPage.setWebViewClient(new WebViewClient());

        //if cannot load the website
//        wvMyPage.getSettings().setJavaScriptEnabled(false);
//        wvMyPage.getSettings().setAllowFileAccess(false);
//        wvMyPage.getSettings().setBuiltInZoomControls(true);

        btnLoadUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.rp.edu.sg";
                wvMyPage.loadUrl(url);
            }
        });

        //go to manifests and seek user permission to access internet

    }
}
