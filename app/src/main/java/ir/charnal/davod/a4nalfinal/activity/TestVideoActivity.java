package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import com.iceteck.silicompressorr.SiliCompressor;

import java.io.File;
import java.net.URISyntaxException;

import ir.charnal.davod.a4nalfinal.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class TestVideoActivity extends AppCompatActivity {

    private static final int SELECT_VIDEO = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupFont();
        setContentView(R.layout.activity_test_video);


        Button button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pickIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                pickIntent.setType("video/*");
                startActivityForResult(pickIntent, SELECT_VIDEO);
            }
        });

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        VideoView videoView = findViewById(R.id.videoView);

        if (resultCode == RESULT_OK) {
            Uri uri = data.getData();
            File file = new File(Environment.getExternalStorageDirectory().getPath(), "MyFolder/Video");
            if (!file.exists()) {
                file.mkdirs();
                try {

                        String filePath = SiliCompressor.with(TestVideoActivity.this).compressVideo(uri, file.getAbsolutePath() + "/" + System.currentTimeMillis() + ".mp4");
                        videoView.setVideoPath(filePath);
                        videoView.start();

                    Toast.makeText(this, "" + file.getPath(), Toast.LENGTH_SHORT).show();
                } catch (URISyntaxException e) {
                    Log.e("error", "gir kardim");
                }

            }
        }
    }

    private void setupFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iran_sans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}