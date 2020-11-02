package argha.filefinder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView scriptListView;
    private List<ScriptModel> scriptModel;
    private ScriptAdapter adapter;

    private EditText scriptQuery;
    private Button generateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scriptModel = new ArrayList<>();
        adapter = new ScriptAdapter(this, scriptModel);

        generateButton = findViewById(R.id.generateButton);
        scriptQuery = findViewById(R.id.scriptQuery);

        scriptListView = findViewById(R.id.script_list);
        scriptListView.setHasFixedSize(true);
        scriptListView.setLayoutManager(new LinearLayoutManager(this));
        scriptListView.setAdapter(adapter);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(scriptQuery.getText().length() > 0) {
                    String query = scriptQuery.getText().toString();
                    scriptModel.clear();
                    scriptModel.add(new ScriptModel("Audio", query + ScriptModel.AUDIO_SCRIPT));
                    scriptModel.add(new ScriptModel("Video", query + ScriptModel.VIDEO_SCRIPT));
                    scriptModel.add(new ScriptModel("Image", query + ScriptModel.IMAGE_SCRIPT));
                    scriptModel.add(new ScriptModel("Document", query + ScriptModel.DOCUMENT_SCRIPT));
                    scriptModel.add(new ScriptModel("Application", query + ScriptModel.APPLICATION_SCRIPT));
                } else {
                    scriptQuery.setError("Query Required");
                    scriptModel.clear();
                }
                adapter.notifyDataSetChanged();
            }
        });

    }
}
