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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Indication Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IndicationHandler is an abstract superclass describing how an Indication is to be processd/delivered/'handled'. This may define a destination and protocol for delivering Indications, or it may define a process to invoke. This class is derived from CIM_ManagedElement to allow modeling the dependency of the Handler on a specific service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IndicationHandler#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IndicationHandler()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ListenerDestination\"]' Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Event' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IndicationHandler extends CIM_ListenerDestination {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the entity that created and/or maintains this Handler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationHandler_Owner()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationHandler#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

} // CIM_IndicationHandler
