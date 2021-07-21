package com.jeniffer.my_students_app.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jeniffer.my_students_app.api.ListProvider
import com.jeniffer.my_students_app.models.Items
import com.jeniffer.my_students_app.models.Student
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    var itemsLiveData = MutableLiveData<List<Items>>()
    val studentsLiveData = MutableLiveData<List<Student>>()

    fun getItems() {
        CoroutineScope(Dispatchers.IO).launch {
            itemsLiveData.postValue(ListProvider.placeHolderApi.getItems())
        }
    }

    fun addStudent(newStudent: Student){
        CoroutineScope(Dispatchers.IO).launch {
            studentsLiveData.postValue(ListProvider.placeHolderApi.addStudents(newStudent))
        }
    }
}