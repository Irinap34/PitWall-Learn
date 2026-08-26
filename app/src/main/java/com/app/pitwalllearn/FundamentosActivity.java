package com.app.pitwalllearn;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

public class FundamentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundamentos);

        ArrayList<String> conceptos = new ArrayList<>();
        conceptos.add("Pole Position");
        conceptos.add("Grid");
        conceptos.add("Pit Lane");
        conceptos.add("Pit Stop");
        conceptos.add("DNF");
        conceptos.add("DNS");

        RecyclerView recyclerConceptos = findViewById(R.id.recyclerConceptos);
        ConceptoAdapter adapter = new ConceptoAdapter(conceptos);
        recyclerConceptos.setLayoutManager(
                new LinearLayoutManager(this)
        );
        recyclerConceptos.setAdapter(adapter);
    }
}