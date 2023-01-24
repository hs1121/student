package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.util.DemoRepo;
import com.example.student.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private DemoRepo demoRepo;

    public StudentService(){
        this.demoRepo=new DemoRepo();
    }

    public Response getStudent( @NonNull Long id){
        for (Student student:demoRepo.studentList){
            if(student.getId()==id)
                return new Response(200,student);
        }
        return new Response(404,"Student not found");
    }

    public Response insertStudent( @NonNull Student student){
                student.setId(DemoRepo.idVal);
                DemoRepo.idVal++;
        demoRepo.studentList.add(student);
                return new Response(202,"Student inserted " + student.toString());

    }

    public Response deleteStudent(Long id) {
        int index=-1;
        for (int i=0;i<demoRepo.studentList.size();i++ ) {
            if (demoRepo.studentList.get(i).getId()==id){
                index=i;
                break;
            }
        }
        if (index==-1){
            return new Response(404,"No Student found with id = "+id);
        }
        demoRepo.studentList.remove(index);
        return new Response(200,"Student deleted.");
    }

    public Response getAll(){
        return new Response(200,demoRepo.studentList);
    }
}
