import java.util.*;
public class ResumeAnalyzer 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println(" RESUME ANALYZER ");
        System.out.println("Paste your resume text below:");
        System.out.println("--------------------------------");

        String resume = sc.nextLine().toLowerCase();

        int score = 0;

        String[] skills = {
                "java", "python", "sql", "html", "css",
                "javascript", "react", "machine learning",
                "data structures", "algorithms", "git", "linux"
        };

        List<String> foundSkills = new ArrayList<>();
        List<String> missingSkills = new ArrayList<>();

        for (String skill : skills) 
        {

            if (resume.contains(skill)) 
            {
                score += 8;
                foundSkills.add(skill);
            } else {
                missingSkills.add(skill);
            }
        }

        if (score > 100) 
        {
            score = 100;
        }

        System.out.println("ANALYSIS RESULT\n ");

        System.out.println("Resume Score: " + score + "/100");

        System.out.println("Skills Found\n:");
        for (String s : foundSkills) {
            System.out.println("- " + s);
        }

        System.out.println("\nMissing Important Skills:");
        for (String s : missingSkills) 
        {
            System.out.println("- " + s);
        }

        System.out.println(" SUGGESTIONS\n ");

        if (score < 40) 
        {
            System.out.println("Add more technical skills.");
        } else if (score < 70) {
            System.out.println("Your resume is average. Add projects and certifications.");
        } else {
            System.out.println("Good resume! Try adding more advanced technologies.");
        }

        sc.close();
    }
}

                     * Example Run

- Input:

  I know Java, HTML, CSS and SQL. I built a web project.

- Output:

 ANALYSIS RESULT

 Resume Score: 32/100

 Skills Found:
- java
- html
- css
- sql

 Missing Important Skills:
- python
- javascript
- react
- machine learning
- data structures
- algorithms
- git
- linux


