/*******************************************************************************
 *  Copyright (c) 2014 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli
 * 				 Liagouras Georgios Andreas
 *  Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/*

 * An XML document type.
 * Localname: MigrationGoals
 * Namespace: http://www.example.org/MGschema
 * Java type: org.example.mGschema.MigrationGoalsDocument
 *
 * Automatically generated - do not modify.
 */
package org.example.mGschema.impl;
/**
 * A document containing one MigrationGoals(@http://www.example.org/MGschema) element.
 *
 * This is a complex type.
 */
public class MigrationGoalsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MigrationGoalsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIGRATIONGOALS$0 = 
        new javax.xml.namespace.QName("http://www.example.org/MGschema", "MigrationGoals");
    
    
    /**
     * Gets the "MigrationGoals" element
     */
    public org.example.mGschema.MigrationGoalsDocument.MigrationGoals getMigrationGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals target = null;
            target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals)get_store().find_element_user(MIGRATIONGOALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MigrationGoals" element
     */
    public void setMigrationGoals(org.example.mGschema.MigrationGoalsDocument.MigrationGoals migrationGoals)
    {
        generatedSetterHelperImpl(migrationGoals, MIGRATIONGOALS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MigrationGoals" element
     */
    public org.example.mGschema.MigrationGoalsDocument.MigrationGoals addNewMigrationGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals target = null;
            target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals)get_store().add_element_user(MIGRATIONGOALS$0);
            return target;
        }
    }
    /**
     * An XML MigrationGoals(@http://www.example.org/MGschema).
     *
     * This is a complex type.
     */
    public static class MigrationGoalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals
    {
        private static final long serialVersionUID = 1L;
        
        public MigrationGoalsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TECHNICALGOALS$0 = 
            new javax.xml.namespace.QName("http://www.example.org/MGschema", "TechnicalGoals");
        private static final javax.xml.namespace.QName BUSINESS$2 = 
            new javax.xml.namespace.QName("http://www.example.org/MGschema", "Business");
        
        
        /**
         * Gets the "TechnicalGoals" element
         */
        public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals getTechnicalGoals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals target = null;
                target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals)get_store().find_element_user(TECHNICALGOALS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "TechnicalGoals" element
         */
        public void setTechnicalGoals(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals technicalGoals)
        {
            generatedSetterHelperImpl(technicalGoals, TECHNICALGOALS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "TechnicalGoals" element
         */
        public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals addNewTechnicalGoals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals target = null;
                target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals)get_store().add_element_user(TECHNICALGOALS$0);
                return target;
            }
        }
        
        /**
         * Gets the "Business" element
         */
        public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business getBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business target = null;
                target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business)get_store().find_element_user(BUSINESS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Business" element
         */
        public void setBusiness(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business business)
        {
            generatedSetterHelperImpl(business, BUSINESS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Business" element
         */
        public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business addNewBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business target = null;
                target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business)get_store().add_element_user(BUSINESS$2);
                return target;
            }
        }
        /**
         * An XML TechnicalGoals(@http://www.example.org/MGschema).
         *
         * This is a complex type.
         */
        public static class TechnicalGoalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals
        {
            private static final long serialVersionUID = 1L;
            
            public TechnicalGoalsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AP$0 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "a_p");
            private static final javax.xml.namespace.QName SLA$2 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "SLA");
            private static final javax.xml.namespace.QName UC$4 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "u_c");
            private static final javax.xml.namespace.QName IAAS$6 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "iaas");
            private static final javax.xml.namespace.QName INTEROP$8 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "interop");
            
            
            /**
             * Gets the "a_p" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP getAP()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP)get_store().find_element_user(AP$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "a_p" element
             */
            public void setAP(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP ap)
            {
                generatedSetterHelperImpl(ap, AP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "a_p" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP addNewAP()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP)get_store().add_element_user(AP$0);
                    return target;
                }
            }
            
            /**
             * Gets the "SLA" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA getSLA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA)get_store().find_element_user(SLA$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SLA" element
             */
            public void setSLA(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA sla)
            {
                generatedSetterHelperImpl(sla, SLA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "SLA" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA addNewSLA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA)get_store().add_element_user(SLA$2);
                    return target;
                }
            }
            
            /**
             * Gets the "u_c" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC getUC()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC)get_store().find_element_user(UC$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "u_c" element
             */
            public void setUC(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC uc)
            {
                generatedSetterHelperImpl(uc, UC$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "u_c" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC addNewUC()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC)get_store().add_element_user(UC$4);
                    return target;
                }
            }
            
            /**
             * Gets the "iaas" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas getIaas()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas)get_store().find_element_user(IAAS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "iaas" element
             */
            public void setIaas(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas iaas)
            {
                generatedSetterHelperImpl(iaas, IAAS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "iaas" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas addNewIaas()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas)get_store().add_element_user(IAAS$6);
                    return target;
                }
            }
            
            /**
             * Gets the "interop" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop getInterop()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop)get_store().find_element_user(INTEROP$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "interop" element
             */
            public void setInterop(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop interop)
            {
                generatedSetterHelperImpl(interop, INTEROP$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "interop" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop addNewInterop()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop)get_store().add_element_user(INTEROP$8);
                    return target;
                }
            }
            /**
             * An XML a_p(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class APImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP
            {
                private static final long serialVersionUID = 1L;
                
                public APImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MIGRATEDPL$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "migratedpl");
                private static final javax.xml.namespace.QName MULTITENANCY$2 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "multitenancy");
                private static final javax.xml.namespace.QName TDATABASEREQ$4 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "tdatabasereq");
                
                
                /**
                 * Gets the "migratedpl" element
                 */
                public java.lang.String getMigratedpl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIGRATEDPL$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "migratedpl" element
                 */
                public org.apache.xmlbeans.XmlString xgetMigratedpl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIGRATEDPL$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "migratedpl" element
                 */
                public void setMigratedpl(java.lang.String migratedpl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIGRATEDPL$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIGRATEDPL$0);
                      }
                      target.setStringValue(migratedpl);
                    }
                }
                
                /**
                 * Sets (as xml) the "migratedpl" element
                 */
                public void xsetMigratedpl(org.apache.xmlbeans.XmlString migratedpl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIGRATEDPL$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIGRATEDPL$0);
                      }
                      target.set(migratedpl);
                    }
                }
                
                /**
                 * Gets the "multitenancy" element
                 */
                public java.lang.String getMultitenancy()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTITENANCY$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "multitenancy" element
                 */
                public org.apache.xmlbeans.XmlString xgetMultitenancy()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MULTITENANCY$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "multitenancy" element
                 */
                public void setMultitenancy(java.lang.String multitenancy)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTITENANCY$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MULTITENANCY$2);
                      }
                      target.setStringValue(multitenancy);
                    }
                }
                
                /**
                 * Sets (as xml) the "multitenancy" element
                 */
                public void xsetMultitenancy(org.apache.xmlbeans.XmlString multitenancy)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MULTITENANCY$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MULTITENANCY$2);
                      }
                      target.set(multitenancy);
                    }
                }
                
                /**
                 * Gets the "tdatabasereq" element
                 */
                public java.lang.String getTdatabasereq()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TDATABASEREQ$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "tdatabasereq" element
                 */
                public org.apache.xmlbeans.XmlString xgetTdatabasereq()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TDATABASEREQ$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "tdatabasereq" element
                 */
                public void setTdatabasereq(java.lang.String tdatabasereq)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TDATABASEREQ$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TDATABASEREQ$4);
                      }
                      target.setStringValue(tdatabasereq);
                    }
                }
                
                /**
                 * Sets (as xml) the "tdatabasereq" element
                 */
                public void xsetTdatabasereq(org.apache.xmlbeans.XmlString tdatabasereq)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TDATABASEREQ$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TDATABASEREQ$4);
                      }
                      target.set(tdatabasereq);
                    }
                }
            }
            /**
             * An XML SLA(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class SLAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA
            {
                private static final long serialVersionUID = 1L;
                
                public SLAImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RELIABILITY$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "reliability");
                private static final javax.xml.namespace.QName DATALOCATION$2 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "datalocation");
                private static final javax.xml.namespace.QName RESPONSET$4 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "responset");
                
                
                /**
                 * Gets the "reliability" element
                 */
                public byte getReliability()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELIABILITY$0, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getByteValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "reliability" element
                 */
                public org.apache.xmlbeans.XmlByte xgetReliability()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlByte target = null;
                      target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(RELIABILITY$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "reliability" element
                 */
                public void setReliability(byte reliability)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELIABILITY$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELIABILITY$0);
                      }
                      target.setByteValue(reliability);
                    }
                }
                
                /**
                 * Sets (as xml) the "reliability" element
                 */
                public void xsetReliability(org.apache.xmlbeans.XmlByte reliability)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlByte target = null;
                      target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(RELIABILITY$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(RELIABILITY$0);
                      }
                      target.set(reliability);
                    }
                }
                
                /**
                 * Gets the "datalocation" element
                 */
                public java.lang.String getDatalocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATALOCATION$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "datalocation" element
                 */
                public org.apache.xmlbeans.XmlString xgetDatalocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATALOCATION$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "datalocation" element
                 */
                public void setDatalocation(java.lang.String datalocation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATALOCATION$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATALOCATION$2);
                      }
                      target.setStringValue(datalocation);
                    }
                }
                
                /**
                 * Sets (as xml) the "datalocation" element
                 */
                public void xsetDatalocation(org.apache.xmlbeans.XmlString datalocation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATALOCATION$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATALOCATION$2);
                      }
                      target.set(datalocation);
                    }
                }
                
                /**
                 * Gets the "responset" element
                 */
                public float getResponset()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSET$4, 0);
                      if (target == null)
                      {
                        return 0.0f;
                      }
                      return target.getFloatValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "responset" element
                 */
                public org.apache.xmlbeans.XmlFloat xgetResponset()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlFloat target = null;
                      target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(RESPONSET$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "responset" element
                 */
                public void setResponset(float responset)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSET$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSET$4);
                      }
                      target.setFloatValue(responset);
                    }
                }
                
                /**
                 * Sets (as xml) the "responset" element
                 */
                public void xsetResponset(org.apache.xmlbeans.XmlFloat responset)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlFloat target = null;
                      target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(RESPONSET$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(RESPONSET$4);
                      }
                      target.set(responset);
                    }
                }
            }
            /**
             * An XML u_c(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class UCImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC
            {
                private static final long serialVersionUID = 1L;
                
                public UCImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CONFIGREQ$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "configreq");
                private static final javax.xml.namespace.QName AUTHORREQ$2 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "authorreq");
                
                
                /**
                 * Gets the "configreq" element
                 */
                public java.lang.String getConfigreq()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIGREQ$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "configreq" element
                 */
                public org.apache.xmlbeans.XmlString xgetConfigreq()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIGREQ$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "configreq" element
                 */
                public void setConfigreq(java.lang.String configreq)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIGREQ$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIGREQ$0);
                      }
                      target.setStringValue(configreq);
                    }
                }
                
                /**
                 * Sets (as xml) the "configreq" element
                 */
                public void xsetConfigreq(org.apache.xmlbeans.XmlString configreq)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIGREQ$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFIGREQ$0);
                      }
                      target.set(configreq);
                    }
                }
                
                /**
                 * Gets the "authorreq" element
                 */
                public java.lang.String getAuthorreq()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORREQ$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "authorreq" element
                 */
                public org.apache.xmlbeans.XmlString xgetAuthorreq()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHORREQ$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "authorreq" element
                 */
                public void setAuthorreq(java.lang.String authorreq)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORREQ$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORREQ$2);
                      }
                      target.setStringValue(authorreq);
                    }
                }
                
                /**
                 * Sets (as xml) the "authorreq" element
                 */
                public void xsetAuthorreq(org.apache.xmlbeans.XmlString authorreq)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHORREQ$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHORREQ$2);
                      }
                      target.set(authorreq);
                    }
                }
            }
            /**
             * An XML iaas(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class IaasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas
            {
                private static final long serialVersionUID = 1L;
                
                public IaasImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TARGETPLAT$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "targetplat");
                
                
                /**
                 * Gets the "targetplat" element
                 */
                public java.lang.String getTargetplat()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETPLAT$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "targetplat" element
                 */
                public org.apache.xmlbeans.XmlString xgetTargetplat()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETPLAT$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "targetplat" element
                 */
                public void setTargetplat(java.lang.String targetplat)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETPLAT$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETPLAT$0);
                      }
                      target.setStringValue(targetplat);
                    }
                }
                
                /**
                 * Sets (as xml) the "targetplat" element
                 */
                public void xsetTargetplat(org.apache.xmlbeans.XmlString targetplat)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETPLAT$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETPLAT$0);
                      }
                      target.set(targetplat);
                    }
                }
            }
            /**
             * An XML interop(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class InteropImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop
            {
                private static final long serialVersionUID = 1L;
                
                public InteropImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName INTEROPREQ$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "interopreq");
                
                
                /**
                 * Gets the "interopreq" element
                 */
                public java.lang.String getInteropreq()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEROPREQ$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "interopreq" element
                 */
                public org.apache.xmlbeans.XmlString xgetInteropreq()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTEROPREQ$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "interopreq" element
                 */
                public void setInteropreq(java.lang.String interopreq)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEROPREQ$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEROPREQ$0);
                      }
                      target.setStringValue(interopreq);
                    }
                }
                
                /**
                 * Sets (as xml) the "interopreq" element
                 */
                public void xsetInteropreq(org.apache.xmlbeans.XmlString interopreq)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTEROPREQ$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTEROPREQ$0);
                      }
                      target.set(interopreq);
                    }
                }
            }
        }
        /**
         * An XML Business(@http://www.example.org/MGschema).
         *
         * This is a complex type.
         */
        public static class BusinessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business
        {
            private static final long serialVersionUID = 1L;
            
            public BusinessImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MON$0 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "mon");
            private static final javax.xml.namespace.QName USE$2 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "use");
            private static final javax.xml.namespace.QName BIL$4 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "bil");
            private static final javax.xml.namespace.QName PRO$6 = 
                new javax.xml.namespace.QName("http://www.example.org/MGschema", "pro");
            
            
            /**
             * Gets the "mon" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon getMon()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon)get_store().find_element_user(MON$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "mon" element
             */
            public void setMon(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon mon)
            {
                generatedSetterHelperImpl(mon, MON$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "mon" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon addNewMon()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon)get_store().add_element_user(MON$0);
                    return target;
                }
            }
            
            /**
             * Gets the "use" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use getUse()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use)get_store().find_element_user(USE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "use" element
             */
            public void setUse(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use use)
            {
                generatedSetterHelperImpl(use, USE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "use" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use addNewUse()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use)get_store().add_element_user(USE$2);
                    return target;
                }
            }
            
            /**
             * Gets the "bil" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil getBil()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil)get_store().find_element_user(BIL$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "bil" element
             */
            public void setBil(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil bil)
            {
                generatedSetterHelperImpl(bil, BIL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "bil" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil addNewBil()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil)get_store().add_element_user(BIL$4);
                    return target;
                }
            }
            
            /**
             * Gets the "pro" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro getPro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro)get_store().find_element_user(PRO$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "pro" element
             */
            public void setPro(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro pro)
            {
                generatedSetterHelperImpl(pro, PRO$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "pro" element
             */
            public org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro addNewPro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro target = null;
                    target = (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro)get_store().add_element_user(PRO$6);
                    return target;
                }
            }
            /**
             * An XML mon(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class MonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon
            {
                private static final long serialVersionUID = 1L;
                
                public MonImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MEASURELEM$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "measur_elem");
                
                
                /**
                 * Gets the "measur_elem" element
                 */
                public java.lang.String getMeasurElem()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASURELEM$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "measur_elem" element
                 */
                public org.apache.xmlbeans.XmlString xgetMeasurElem()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEASURELEM$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "measur_elem" element
                 */
                public void setMeasurElem(java.lang.String measurElem)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASURELEM$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEASURELEM$0);
                      }
                      target.setStringValue(measurElem);
                    }
                }
                
                /**
                 * Sets (as xml) the "measur_elem" element
                 */
                public void xsetMeasurElem(org.apache.xmlbeans.XmlString measurElem)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEASURELEM$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEASURELEM$0);
                      }
                      target.set(measurElem);
                    }
                }
            }
            /**
             * An XML use(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class UseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use
            {
                private static final long serialVersionUID = 1L;
                
                public UseImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName WAI$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "wai");
                
                
                /**
                 * Gets the "wai" element
                 */
                public java.lang.String getWai()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAI$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "wai" element
                 */
                public org.apache.xmlbeans.XmlString xgetWai()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WAI$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "wai" element
                 */
                public void setWai(java.lang.String wai)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAI$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAI$0);
                      }
                      target.setStringValue(wai);
                    }
                }
                
                /**
                 * Sets (as xml) the "wai" element
                 */
                public void xsetWai(org.apache.xmlbeans.XmlString wai)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WAI$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WAI$0);
                      }
                      target.set(wai);
                    }
                }
            }
            /**
             * An XML bil(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class BilImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil
            {
                private static final long serialVersionUID = 1L;
                
                public BilImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RULE$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "rule");
                
                
                /**
                 * Gets the "rule" element
                 */
                public java.lang.String getRule()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RULE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rule" element
                 */
                public org.apache.xmlbeans.XmlString xgetRule()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RULE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "rule" element
                 */
                public void setRule(java.lang.String rule)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RULE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RULE$0);
                      }
                      target.setStringValue(rule);
                    }
                }
                
                /**
                 * Sets (as xml) the "rule" element
                 */
                public void xsetRule(org.apache.xmlbeans.XmlString rule)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RULE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RULE$0);
                      }
                      target.set(rule);
                    }
                }
            }
            /**
             * An XML pro(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public static class ProImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro
            {
                private static final long serialVersionUID = 1L;
                
                public ProImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName LICENSEMOD$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/MGschema", "license_mod");
                
                
                /**
                 * Gets the "license_mod" element
                 */
                public java.lang.String getLicenseMod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LICENSEMOD$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "license_mod" element
                 */
                public org.apache.xmlbeans.XmlString xgetLicenseMod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LICENSEMOD$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "license_mod" element
                 */
                public void setLicenseMod(java.lang.String licenseMod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LICENSEMOD$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LICENSEMOD$0);
                      }
                      target.setStringValue(licenseMod);
                    }
                }
                
                /**
                 * Sets (as xml) the "license_mod" element
                 */
                public void xsetLicenseMod(org.apache.xmlbeans.XmlString licenseMod)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LICENSEMOD$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LICENSEMOD$0);
                      }
                      target.set(licenseMod);
                    }
                }
            }
        }
    }
}
