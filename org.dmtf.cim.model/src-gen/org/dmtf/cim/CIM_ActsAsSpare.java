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
package org.dmtf.cim;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Acts As Spare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ActsAsSpare association indicates which elements can spare or replace the other aggregated elements. The fact that a spare can operate in "hot standby" mode is specified on an element by element basis. 
 * The use of this class is being deprecated in lieu of using the IsSpare relationship.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ActsAsSpare#getGroup <em>Group</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ActsAsSpare#getSpare <em>Spare</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ActsAsSpare#getHotStandby <em>Hot Standby</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ActsAsSpare()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_IsSpare\"]' Version='2.8.1000' UMLPackagePath='CIM::Core::Redundancy' keys='Group,Spare'"
 * @generated
 */
@ProviderType
public interface CIM_ActsAsSpare extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SpareGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(CIM_SpareGroup)
	 * @see org.dmtf.cim.CimPackage#getCIM_ActsAsSpare_Group()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SpareGroup REF' Deprecated='[\"CIM_IsSpare.Dependent\"]' Key='true'"
	 * @generated
	 */
	CIM_SpareGroup getGroup();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ActsAsSpare#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(CIM_SpareGroup value);

	/**
	 * Returns the value of the '<em><b>Spare</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ManagedSystemElement acting as a spare and participating in the SpareGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spare</em>' reference.
	 * @see #setSpare(CIM_ManagedSystemElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ActsAsSpare_Spare()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' Deprecated='[\"CIM_IsSpare.Antecedent\"]' Key='true'"
	 * @generated
	 */
	CIM_ManagedSystemElement getSpare();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ActsAsSpare#getSpare <em>Spare</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spare</em>' reference.
	 * @see #getSpare()
	 * @generated
	 */
	void setSpare(CIM_ManagedSystemElement value);

	/**
	 * Returns the value of the '<em><b>Hot Standby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HotStandby is a boolean indicating that the spare is operating as a hot standby.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hot Standby</em>' attribute.
	 * @see #setHotStandby(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ActsAsSpare_HotStandby()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_IsSpare.SpareStatus\"]'"
	 * @generated
	 */
	Boolean getHotStandby();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ActsAsSpare#getHotStandby <em>Hot Standby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Standby</em>' attribute.
	 * @see #getHotStandby()
	 * @generated
	 */
	void setHotStandby(Boolean value);

} // CIM_ActsAsSpare
