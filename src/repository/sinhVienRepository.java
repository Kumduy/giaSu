/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author ADMINS
 */
public class sinhVienRepository {
    
public List<SinhVien> readFile(String path) throws FileNotFoundException {
        FileReader file = new FileReader(path);
        List<SinhVien> ls = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(file)) {
             String line;
            while ((line = br.readLine()) != null) {
                String[] part = line.split(" ");
                SinhVien sv = new SinhVien(Integer.parseInt(part[0]), part[1], Integer.parseInt(part[2]), part[3]);
                ls.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ls;
    }
    
public void writeFile(String path, List<SinhVien> data) throws FileNotFoundException, IOException {
        FileWriter file = new FileWriter(path);
        try (BufferedWriter bw = new BufferedWriter(file)) {
            for (SinhVien sinhVien : data) {
                bw.write(sinhVien.getId()+" "+sinhVien.getTen()+" "+sinhVien.getTuoi()+" "+sinhVien.getNganh());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
