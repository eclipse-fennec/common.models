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
 * A representation of the model object '<em><b>CIM Alert Inst Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of CIM_AlertIndication that embeds a CIM_Inst Indication. It is used when adding AlertIndication data to a LifeCycle Indication.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AlertInstIndication#getIndObject <em>Ind Object</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AlertInstIndication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.6.0' UMLPackagePath='CIM::Event' override.AlertType='uint16' override.AlertType.Description='The primary classification of the Indication, defaulted to 7, \"Model Change\", for this class. This is done because: 1) the primary purpose of AlertInstIndication is to add Alert data to a LifeCycle Indication; and 2) LifeCycle Indications deal with \'model changes\'.'"
 * @generated
 */
@ProviderType
public interface CIM_AlertInstIndication extends CIM_AlertIndication {
	/**
	 * Returns the value of the '<em><b>Ind Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Embeds the InstIndication that is part of this Alert Indication. Only the properties selected by the Indication Filter's Query are included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ind Object</em>' attribute.
	 * @see #setIndObject(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlertInstIndication_IndObject()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedObject='true'"
	 * @generated
	 */
	String getIndObject();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlertInstIndication#getIndObject <em>Ind Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ind Object</em>' attribute.
	 * @see #getIndObject()
	 * @generated
	 */
	void setIndObject(String value);

} // CIM_AlertInstIndication
