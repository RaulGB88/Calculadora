/*
 * Copyright 2016 2K16 - Angel Pastelero angel.pastelero399@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;
import java.util.Scanner;
/**
 *
 * @author 2K16 - Angel Pastelero angel.pastelero399@gmail.com
 */
public class App {
    // Iniciar Aplicacion
    private final Scanner scn = new Scanner(System.in, "ISO-8859-1");
    private int nNext = 0;
    private int nAc = 0;
    private String accion = "";
    public void lanzarAplicacion() {
        primerNumero();
        operacion();
        
    }
    
    private void primerNumero() {
        boolean testOK = true;
        while (testOK) {
            try {
                System.out.print("Numero : ");
                nAc = scn.nextInt();
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error primer Numero");
            } finally {
                scn.nextLine();
            }
        }
        
    }
    
    private void introducirNumero() {
        nNext = 0;
        boolean testOK = true;
        while (testOK) {
            try {
                System.out.print("Numero : ");
                nNext = scn.nextInt();
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error introducir Numero");
            } finally {
                scn.nextLine();
            }
        }

    }
    
    private void operacion() {
        System.out.print("Operacion : ");
        accion = scn.nextLine();
        switch (accion) {
            case "+":
                introducirNumero();
                sumar();
                break;
            case "-":
                introducirNumero();
                restar();            
            case "*":
                introducirNumero();
                multiplicar();            
            case "/":
                introducirNumero();
                dividir();
            case "=":
                igual();
        }
    }
    
    private void sumar() {
        nAc = nAc + nNext;
        System.out.println(nAc);
        operacion();
    }
    
    
    private void restar() {
        nAc = nAc - nNext;
        System.out.println(nAc);
        operacion();
    }
    
    private void multiplicar() {
        nAc = nAc * nNext;
        System.out.println(nAc);
        operacion();
    }
    
    private void dividir() {
        if (nAc == 0 || nNext == 0) {
            System.out.println("No se puede dividir por 0");
            System.out.println("Math error");
            System.exit(0);
        } else {
        nAc = nAc / nNext;
        System.out.println(nAc);
        operacion();
        }
    }
    
    private void igual() {
        System.out.println(nAc);
        System.exit(0);
    }
}