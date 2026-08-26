package com.app.pitwalllearn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ConceptoAdapter extends RecyclerView.Adapter<ConceptoAdapter.ConceptoViewHolder> {

    private ArrayList<String> conceptos;

    public ConceptoAdapter(ArrayList<String> conceptos) {
        this.conceptos = conceptos;
    }

    @NonNull
    @Override
    public ConceptoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_concepto, parent, false);

        return new ConceptoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConceptoViewHolder holder, int position) {
        String concepto = conceptos.get(position);
        holder.txtConcepto.setText(concepto);
    }

    @Override
    public int getItemCount() {
        return conceptos.size();
    }

    public static class ConceptoViewHolder extends RecyclerView.ViewHolder {

        TextView txtConcepto;

        public ConceptoViewHolder(@NonNull View itemView) {
            super(itemView);

            txtConcepto = itemView.findViewById(R.id.txtConcepto);
        }
    }
}