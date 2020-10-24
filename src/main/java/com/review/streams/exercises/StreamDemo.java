package com.review.streams.exercises;

import com.review.enums.Gender;
import com.review.enums.Status;
import com.review.oop.encapsulation.User;
import com.review.oop.inharitance.Project;

import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {




    /*TODO 1:
     */
   public static List<Project> getListOfProject(){
       List<Project>  projectList = DataGenerator.getProjects();

      return  projectList;

    }



    /*TODO 2:
     */
   public static List<Project> getListOfProject(Status status){

       List<Project> listOfProjects = DataGenerator.getProjects();
       return listOfProjects.stream().filter(st -> st.getProjectStatus().equals(status)).collect(Collectors.toList());

    }




     /*TODO 3:
      */
   public static List<Project> getListOfProject(User manager){
       List<Project> listOfProjects = DataGenerator.getProjects();
       return listOfProjects.stream().filter(mn -> mn.getAssignedManager().equals(manager)).collect(Collectors.toList());
    }



    /*TODO 4:
     */
   public static List<Project> getListOfProjectCode(String projectCode){

       List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(pc -> pc.getProjectCode().equals(projectCode)).collect(Collectors.toList());

    }




    /*TODO 5:
     */
   public static List<User> getListOfUser(){

         List<User> listOfUsers = DataGenerator.getUsers();
          return listOfUsers;
    }




     /*TODO 6:
      */
   public static User getUserByFirstName(String firstName){

          List<User> listOfUsers = DataGenerator.getUsers();
            return listOfUsers.stream().filter(fn -> fn.getFirstName().equals(firstName)).findFirst().get();

    }




    /*TODO 7:

   public static String getUserById(Long id){

    }
  */



    /*TODO 8:
     */
   public static List<User> deleteUser(String firstName){  //delete one  user and return remaining users

       List<User> listOfUsers = DataGenerator.getUsers();
       return listOfUsers.stream().filter(fn -> !fn.getFirstName().equals(firstName)).collect(Collectors.toList());
    }




     /*TODO 9:
      */
   public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus){

       List<Project> listOfProjects = DataGenerator.getProjects();
       listOfProjects.stream().filter(st -> st.getProjectStatus().equals(oldStatus)).forEach(e -> e.setProjectStatus(newStatus));
       return listOfProjects;
    }




    /*TODO 10:

   public static List<Project> findProjectByManager(User manager){

    }
 */


    /*TODO 11: use period()> finding total days between given range

*/
   public static Integer totalProjectDurationForManager(User manager){

       List<Project> listOfProjects = DataGenerator.getProjects();
       Project p = listOfProjects.stream().filter(mn -> mn.getAssignedManager().equals(manager)).findFirst().get();
//        long diffInMillies = Math.abs(p.getEndDate() - p.getStartDate());
//        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
       Period period = Period.between(p.getStartDate(), p.getEndDate());
       return (int) (long) period.getDays();



    }


     /*TODO 12:


     */


   public static long findTotalMaleInCompany(){
       List<User> listOfUsers = DataGenerator.getUsers();
       return (long)listOfUsers.stream().filter(ml -> ml.getGender().equals(Gender.MALE)).count();



    }




}
