package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class UPISNIK implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.Id
   @org.kie.api.definition.type.Label(value = "id_upisnika")
   private java.lang.Integer id_upisnika;
   @org.kie.api.definition.type.Label(value = "redniBroj")
   private java.lang.Integer redniBroj;
   @org.kie.api.definition.type.Label(value = "ponuda_pred")
   private vvgnabava.otvorenipostupak.PONUDA ponuda_pred;

   public UPISNIK()
   {
   }

   public java.lang.Integer getId_upisnika()
   {
      return this.id_upisnika;
   }

   public void setId_upisnika(java.lang.Integer id_upisnika)
   {
      this.id_upisnika = id_upisnika;
   }

   public java.lang.Integer getRedniBroj()
   {
      return this.redniBroj;
   }

   public void setRedniBroj(java.lang.Integer redniBroj)
   {
      this.redniBroj = redniBroj;
   }

   public vvgnabava.otvorenipostupak.PONUDA getPonuda_pred()
   {
      return this.ponuda_pred;
   }

   public void setPonuda_pred(vvgnabava.otvorenipostupak.PONUDA ponuda_pred)
   {
      this.ponuda_pred = ponuda_pred;
   }

   public UPISNIK(java.lang.Integer id_upisnika, java.lang.Integer redniBroj,
         vvgnabava.otvorenipostupak.PONUDA ponuda_pred)
   {
      this.id_upisnika = id_upisnika;
      this.redniBroj = redniBroj;
      this.ponuda_pred = ponuda_pred;
   }

}