/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.SinhVien;
import repository.sinhVienRepository;

/**
 *
 * @author ADMINS
 */
public class SinhVienService {
    sinhVienRepository repo = new sinhVienRepository();


    
    public List<SinhVien> getAll(String path) throws FileNotFoundException {
        return repo.readFile(path);
    }
    
     public void addSinhVien(SinhVien sinhVien, String path) throws FileNotFoundException, IOException {
        List<SinhVien> sinhVienList = repo.readFile(path);
        sinhVienList.add(sinhVien);
        repo.writeFile(path, sinhVienList);
    }
    //Update
    //Làm xoá
}
