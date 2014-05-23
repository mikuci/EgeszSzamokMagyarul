/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.EgeszSzamokMagyarul;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mikuci
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({my.EgeszSzamokMagyarul.GyakorlasIT.class, my.EgeszSzamokMagyarul.StatisztikaIT.class, my.EgeszSzamokMagyarul.BejelentkezesIT.class, my.EgeszSzamokMagyarul.Gyakorlas1_2_3IT.class, my.EgeszSzamokMagyarul.FomenuIT.class, my.EgeszSzamokMagyarul.FeladatIT.class})
public class EgeszSzamokMagyarulITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
