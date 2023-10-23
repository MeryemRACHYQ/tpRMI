/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;
import util.HibernateUtil;

/**
 *
 * @author 2020
 */
public class Test {

    public static void main(String[] args) {

        try {
            IDao<Machine> dao = new MachineService();
            IDao<Salle> dao2 = new SalleService();
            dao.create(new Machine("err1", "toshiba", 5000));
       // dao.create(new Machine("err2", "hp", 10000));
            // dao.create(new Machine("err3", "hp", 10000));
            // Salle s1 = new Salle("s11");
            // Salle s2 = new Salle("s22");
            // Salle s3 = new Salle("s33");

            // dao2.create(s1);
            //dao2.create(s2);
            //dao2.create(s3);
            dao2.create(new Salle("S11"));
            dao2.create(new Salle("S22"));
            dao2.create(new Salle("S33"));
            for (Salle s : dao2.findAll()) {
                System.out.println(s);
            }

       // dao.create(new Machine("err1", "toshiba", 5000));
            // dao.create(new Machine("err2", "hp", 10000));
            //  dao.create(new Machine("err3", "hp", 10000));
            //    dao.create(new Machine("m2", "toshiba", 1000, s1));
            //  dao.create(new Machine("m3", "hp", 1000, s2));
            // dao.create(new Machine("m4", "hp", 1000, s3));
          // for(Machine m : dao.findAll())
            //     System.out.println(m);  
        } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
