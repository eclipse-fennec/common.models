/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.prs;

import org.dmtf.cim.CIM_ManagedElement;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Exchange Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_ExchangeElement is an abstract base class for all classes in the Solution and Service Incident object model. As an abstract class it is never instantiated. 
 * 
 * PRS_ExchangeElement exists to provide a single anchor point for associations that may be made to any Solution or Service Incident object. For example, Administrative or Attachment instances may be associated with any object derived from PRS_ExchangeElement. To support this generic association capability, the PRS_AdminAssociation and PRS_Attached associations both derive from the CIM_Dependency association and override the Antecedent property of that class to be a PRS_ExchangeElement REF.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_ExchangeElement#getPRSUniqueName <em>PRS Unique Name</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_ExchangeElement#getDirtyFlag <em>Dirty Flag</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ExchangeElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_ExchangeElement extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>PRS Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PRSUniqueName property is a Globally Unique IDentifier (GUID) also known as a Universally Unique IDentifier (UUID). This property allows Solution and Service Incident objects to be used by multiple Solutions or Service Incidents without duplication. In addition, all Solution or Service Incidents containing a unique object are updated when the object is updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PRS Unique Name</em>' attribute.
	 * @see #setPRSUniqueName(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ExchangeElement_PRSUniqueName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getPRSUniqueName();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ExchangeElement#getPRSUniqueName <em>PRS Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRS Unique Name</em>' attribute.
	 * @see #getPRSUniqueName()
	 * @generated
	 */
	void setPRSUniqueName(String value);

	/**
	 * Returns the value of the '<em><b>Dirty Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DirtyFlag is used by the SISService Start Transaction method to determine whether an ExchangeElement has been created, modified or deleted since the last Transaction. Any object not marked 'Clean' is included in the next Transaction. 
	 * 
	 * It is the responsibility of the entity creating, modifying or deleting the object derived from ExchangeElement to set this property appropriately. 
	 * 
	 * This property value is set to 'Clean' by an invocation of the Transaction Complete method with a Status parameter of zero (0).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dirty Flag</em>' attribute.
	 * @see #setDirtyFlag(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_ExchangeElement_DirtyFlag()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Clean\",\"New\",\"Modified\",\"Deleted\"]'"
	 * @generated
	 */
	Integer getDirtyFlag();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_ExchangeElement#getDirtyFlag <em>Dirty Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirty Flag</em>' attribute.
	 * @see #getDirtyFlag()
	 * @generated
	 */
	void setDirtyFlag(Integer value);

} // PRS_ExchangeElement
