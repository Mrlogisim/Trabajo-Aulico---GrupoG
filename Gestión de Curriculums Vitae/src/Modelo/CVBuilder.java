package Modelo;

// Implementación del builder que usa la interfaz
public class CVBuilder implements CVBuilderInterface {
    private String education;
    private String experience;
    private String skills;

    @Override
    public CVBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    @Override
    public CVBuilder setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    @Override
    public CVBuilder setSkills(String skills) {
        this.skills = skills;
        return this;
    }

    @Override
    public CV build() {
        return new CV(education, experience, skills);
    }
}
