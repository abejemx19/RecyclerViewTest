package com.example.recyclerviewclasss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var contacts: ArrayList<Contact>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contacts = ArrayList()
        contacts.add(Contact (name = "Sally"))
        contacts.add(Contact (name = "Abenet"))
        contacts.add(Contact (name = "Sibago"))
        contacts.add(Contact (name = "Recharde"))
        contacts.add(Contact (name = "Sally"))
        contacts.add(Contact (name = "Abenet"))
        contacts.add(Contact (name = "Sibago"))
        contacts.add(Contact (name = "Recharde"))
        contacts.add(Contact (name = "Sally"))
        contacts.add(Contact (name = "Abenet"))
        contacts.add(Contact (name = "Sibago"))
        contacts.add(Contact (name = "Recharde"))
        contacts.add(Contact (name = "Sally"))
        contacts.add(Contact (name = "Abenet"))
        contacts.add(Contact (name = "Sibago"))
        contacts.add(Contact (name = "Recharde"))
        contacts.add(Contact (name = "Sally"))
        contacts.add(Contact (name = "Abenet"))
        contacts.add(Contact (name = "Sibago"))
        contacts.add(Contact (name = "Recharde"))
        contacts.add(Contact (name = "Sally"))
        contacts.add(Contact (name = "Abenet"))
        contacts.add(Contact (name = "Sibago"))
        contacts.add(Contact (name = "Recharde"))

        val rvContacts = findViewById<View>(R.id.rvContacts) as RecyclerView

        // Create adapter passing in the sample user data
        val adapter = ContactsAdapter(contacts)
        // Attach the adapter to the recyclerview to populate items
        rvContacts.adapter = adapter
        // Set layout manager to position the items
        rvContacts.layoutManager = LinearLayoutManager(this)
        // That's all!
    }
}