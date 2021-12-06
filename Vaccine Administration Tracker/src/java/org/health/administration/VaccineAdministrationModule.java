/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.health.administration;

import java.util.Date;

/**
 *
 * @author BIGLINKS
 */
public class VaccineAdministrationModule {
    
    
    private int healthid;
    private String NIN;
    private Date dateOfVaccination;
    private Date returnDate;
    private String typeOfVaccine;
    private String batchNumber;
    
//    CREATE TABLE `patients` (
//  `patientsId` int(11) NOT NULL,
//  `healthCenterId` int(255) NOT NULL,
//  `NIN` varchar(255) NOT NULL,
//  `dateOfVaccination` date NOT NULL,
//  `returnDate` date NOT NULL,
//  `typeOfVaccine` varchar(255) NOT NULL,
//  `batchNumber` int(11) NOT NULL
//)
    
    public String createTable(){
        return "CREATE TABLE `patients` (\n" +
"  `patientsId` int(11) NOT NULL,\n" +
"  `healthCenterId` int(255) NOT NULL,\n" +
"  `NIN` varchar(255) NOT NULL,\n" +
"  `dateOfVaccination` date NOT NULL,\n" +
"  `returnDate` date NOT NULL,\n" +
"  `typeOfVaccine` varchar(255) NOT NULL,\n" +
"  `batchNumber` int(11) NOT NULL\n" +
")";
    }
    public String registerPatients(){
        return "jss";
    }
    
    public String getCertificates(){
        return "certificates";
    }
    
    public String viewReports(){
        return "";
    }
    
    
}
