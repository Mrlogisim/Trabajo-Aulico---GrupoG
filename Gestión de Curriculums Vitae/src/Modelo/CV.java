package Modelo;

public class CV {
    private String education;
    private String experience;
    private String skills;

    // Constructor privado, solo el Builder puede acceder a él
    public CV(String education, String experience, String skills) {
        this.education = education != null ? education : "N/A";
        this.experience = experience != null ? experience : "N/A";
        this.skills = skills != null ? skills : "N/A";
    }

    // Getters para acceder a cada sección
    public String getEducation() {
        return education;
    }

    public String getExperience() {
        return experience;
    }

    public String getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "CV {" +
                "Education='" + education + '\'' +
                ", Experience='" + experience + '\'' +
                ", Skills='" + skills + '\'' +
                '}';
    }
}


