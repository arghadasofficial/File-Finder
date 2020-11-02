package argha.filefinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ScriptAdapter extends RecyclerView.Adapter<ScriptAdapter.Holder> {

    private Context context;
    private List<ScriptModel> model;

    public ScriptAdapter(Context context, List<ScriptModel> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.script_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.title.setText(model.get(position).getTitle());
        holder.script.setText(model.get(position).getScript());
        holder.scriptBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Script copied", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView title, script;
        LinearLayout scriptBox;
        public Holder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            script = itemView.findViewById(R.id.script);
            scriptBox = itemView.findViewById(R.id.scriptBox);
        }
    }
}
