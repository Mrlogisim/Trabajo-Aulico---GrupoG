package Modelo;

// Interfaz Builder que define los métodos que debe implementar un constructor de CV
public interface Builder<T> {
    T build();
}

// La interfaz específica de CVBuilder que extiende de Builder
interface CVBuilderInterface extends Builder<CV> {
    CVBuilderInterface setEducation(String education);
    CVBuilderInterface setExperience(String experience);
    CVBuilderInterface setSkills(String skills);
}
