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
 * A representation of the model object '<em><b>CIM Uo WDef Trace Level Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Refers to the refinement of the UnitOfWorkDefinition: the trace level type. It is not required that a UnitOfWork be associated to a TraceLevelType. But if it is associated, only one Type can be specified for the Definition. In contrast, TraceLevelTypes can be reused for multiple Definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UoWDefTraceLevelType#getTraceLevelType <em>Trace Level Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UoWDefTraceLevelType#getUoWDefn <em>Uo WDefn</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UoWDefTraceLevelType()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Metrics::UnitOfWork' keys='TraceLevelType,UoWDefn'"
 * @generated
 */
@ProviderType
public interface CIM_UoWDefTraceLevelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace Level Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trace level type description that is implemented by the UnitOfWorkDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Level Type</em>' reference.
	 * @see #setTraceLevelType(CIM_TraceLevelType)
	 * @see org.dmtf.cim.CimPackage#getCIM_UoWDefTraceLevelType_TraceLevelType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_TraceLevelType REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_TraceLevelType getTraceLevelType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UoWDefTraceLevelType#getTraceLevelType <em>Trace Level Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Level Type</em>' reference.
	 * @see #getTraceLevelType()
	 * @generated
	 */
	void setTraceLevelType(CIM_TraceLevelType value);

	/**
	 * Returns the value of the '<em><b>Uo WDefn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UnitOfWorkDefinition which is refined by the instance of TraceLevelType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uo WDefn</em>' reference.
	 * @see #setUoWDefn(CIM_UnitOfWorkDefinition)
	 * @see org.dmtf.cim.CimPackage#getCIM_UoWDefTraceLevelType_UoWDefn()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_UnitOfWorkDefinition REF' Key='true'"
	 * @generated
	 */
	CIM_UnitOfWorkDefinition getUoWDefn();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UoWDefTraceLevelType#getUoWDefn <em>Uo WDefn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uo WDefn</em>' reference.
	 * @see #getUoWDefn()
	 * @generated
	 */
	void setUoWDefn(CIM_UnitOfWorkDefinition value);

} // CIM_UoWDefTraceLevelType
