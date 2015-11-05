package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("PONUDA")
public class PONUDA implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("id_ponuda")
   private java.lang.Integer id_ponuda;
   @org.kie.api.definition.type.Label("ponuda_za_predmet")
   private java.lang.String ponuda_za_predmet;
   @org.kie.api.definition.type.Label("dobavljac")
   private java.lang.String dobavljac;
   @org.kie.api.definition.type.Label("datu_ponude")
   private java.util.Date datum_ponude;

   @org.kie.api.definition.type.Label("dostavljeni_orginali")
   private java.lang.Boolean dostavljeni_orginali;

   @org.kie.api.definition.type.Label(value = "prihvatljiva")
   private java.lang.Boolean prihvatljiva;

   public PONUDA()
   {
   }

   public java.lang.Integer getId_ponuda()
   {
      return this.id_ponuda;
   }

   public void setId_ponuda(java.lang.Integer id_ponuda)
   {
      this.id_ponuda = id_ponuda;
   }

   public java.lang.String getPonuda_za_predmet()
   {
      return this.ponuda_za_predmet;
   }

   public void setPonuda_za_predmet(java.lang.String ponuda_za_predmet)
   {
      this.ponuda_za_predmet = ponuda_za_predmet;
   }

   public java.lang.String getDobavljac()
   {
      return this.dobavljac;
   }

   public void setDobavljac(java.lang.String dobavljac)
   {
      this.dobavljac = dobavljac;
   }

   public java.util.Date getDatum_ponude()
   {
      return this.datum_ponude;
   }

   public void setDatum_ponude(java.util.Date datum_ponude)
   {
      this.datum_ponude = datum_ponude;
   }

   public java.lang.Boolean getDostavljeni_orginali()
   {
      return this.dostavljeni_orginali;
   }

   public void setDostavljeni_orginali(java.lang.Boolean dostavljeni_orginali)
   {
      this.dostavljeni_orginali = dostavljeni_orginali;
   }

   public java.lang.Boolean getPrihvatljiva()
   {
      return this.prihvatljiva;
   }

   public void setPrihvatljiva(java.lang.Boolean prihvatljiva)
   {
      this.prihvatljiva = prihvatljiva;
   }

   public PONUDA(java.lang.Integer id_ponuda, java.lang.String ponuda_za_predmet,
         java.lang.String dobavljac, java.util.Date datum_ponude,
         java.lang.Boolean dostavljeni_orginali, java.lang.Boolean prihvatljiva)
   {
      this.id_ponuda = id_ponuda;
      this.ponuda_za_predmet = ponuda_za_predmet;
      this.dobavljac = dobavljac;
      this.datum_ponude = datum_ponude;
      this.dostavljeni_orginali = dostavljeni_orginali;
      this.prihvatljiva = prihvatljiva;
   }

}