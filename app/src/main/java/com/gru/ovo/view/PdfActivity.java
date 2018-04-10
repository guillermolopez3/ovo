package com.gru.ovo.view;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.gru.ovo.R;

import java.io.File;
import java.net.URI;

public class PdfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        PDFView pdfView = findViewById(R.id.pdf);


        pdfView.fromAsset("plan_arqui.pdf").load();
    }
}
