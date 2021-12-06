/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.health.booking;

import java.util.Date;

/**
 *
 * @author BIGLINKS
 */
public class VaccinationBookingAndAdvisoryModule {
    
    
     
    private int bookingId;
    private String vaccineName;
    private Date date; 
    private String place;
    private int healthCentreId;
    
//    CREATE TABLE `bookings` (
//  `bookingId` int(11) NOT NULL,
//  `vaccineName` varchar(255) NOT NULL,
//  `place` varchar(255) DEFAULT NULL,
//  `date` date NOT NULL,
//  `healthCenterId` int(11) NOT NULL
//) 
    public String createTable(){
        return "CREATE TABLE `bookings` (\n" +
"  `bookingId` int(11) NOT NULL,\n" +
"  `vaccineName` varchar(255) NOT NULL,\n" +
"  `place` varchar(255) DEFAULT NULL,\n" +
"  `date` date NOT NULL,\n" +
"  `healthCenterId` int(11) NOT NULL\n" +
") ";
    }
   
    
   
    
    
}
