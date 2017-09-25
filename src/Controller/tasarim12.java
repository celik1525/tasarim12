/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruhi ÇELİK
 */
public class tasarim12 {
    EntityManagerFactory emf;
    EntityManager em;
    
    public void baglan(){
        emf=javax.persistence.Persistence.createEntityManagerFactory("Tasarim1PU");
        em=emf.createEntityManager();
            }
    public void ekle(Object nesne){
        try {
            em.getTransaction().begin();
            em.persist(nesne);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, nesne + "EKLENDİ");
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    public static int sicil;
// imaj yükleme
    /*
    @Stateless
public class CustomerService {
    @PersistenceContext(unitName = "ImageTestPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }


    public List<Customer> customerList(){
       return em.createNamedQuery(stat).getResultList();
    }

    public byte[] loadImage(int id){
        return em.find(Customer.class, id).getLogo();
    }

}
    */    
    //imaj yükleme 2
    /*
    
    public class CustomerManager {
    @EJB
    private CustomerService customerService;
    private Customer customer = new Customer();
    private List<Customer> list;
    private DataModel<Customer> dataModel;
    private UploadedFile uploadedFile;

    public CustomerManager() {
    }
    public void createCustomer() throws IOException{
        customer.setId(0);
         byte[] file = uploadedFile.getBytes();
         customer.setLogo(file);
         customerService.persist(customer);
    }

    public void loadTable(){
         dataModel = new ListDataModel<Customer>();
        dataModel.setWrappedData(customerService.findStatus(customer));
    } 

    public String view(){
        customer = dataModel.getRowData();
        return "view.xhtml";
    }
//setter and getter for all
//use the loadTable method to load your model table
    */
}