package ru.startandroid.home_tasks;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Person> contacts;

    MyAdapter(Context context, List<Person> person) {
        this.contacts = person;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        Person person = contacts.get(position);
        holder.imagePhone.setImageResource(person.getPhoto());
        holder.numberContacts.setText(person.getPhone_Number());
        holder.nameContacts.setText(person.getContacts());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imagePhone;
        final TextView nameContacts, numberContacts;

        ViewHolder(View view) {
            super(view);
            imagePhone = view.findViewById(R.id.imageView);
            nameContacts = view.findViewById(R.id.contact);
            numberContacts = view.findViewById(R.id.number);
        }
    }
}