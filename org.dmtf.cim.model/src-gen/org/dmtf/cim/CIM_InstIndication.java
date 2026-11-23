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
 * A representation of the model object '<em><b>CIM Inst Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_InstIndication is an abstract superclass describing changes to instances. Subclasses represent specific types of change notifications, such as instance creation, deletion and modification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InstIndication#getSourceInstance <em>Source Instance</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstIndication#getSourceInstanceModelPath <em>Source Instance Model Path</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstIndication#getSourceInstanceHost <em>Source Instance Host</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstIndication()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Abstract='true' Version='2.29.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_InstIndication extends CIM_Indication {
	/**
	 * Returns the value of the '<em><b>Source Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copy of the instance that changed to generate the Indication. SourceInstance contains the current values of the properties selected by the Indication Filter's Query. In the case of CIM_InstDeletion, the property values are copied before the instance is deleted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Instance</em>' attribute.
	 * @see #setSourceInstance(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstIndication_SourceInstance()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedObject='true'"
	 * @generated
	 */
	String getSourceInstance();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstIndication#getSourceInstance <em>Source Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Instance</em>' attribute.
	 * @see #getSourceInstance()
	 * @generated
	 */
	void setSourceInstance(String value);

	/**
	 * Returns the value of the '<em><b>Source Instance Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Model Path of the SourceInstance. The following format MUST be used to encode the Model Path: 
	 * <NamespacePath>:<ClassName>.<Prop1>="<Value1>", 
	 * <Prop2>="<Value2>", ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Instance Model Path</em>' attribute.
	 * @see #setSourceInstanceModelPath(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstIndication_SourceInstanceModelPath()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_InstIndication.SourceInstance\"]'"
	 * @generated
	 */
	String getSourceInstanceModelPath();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstIndication#getSourceInstanceModelPath <em>Source Instance Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Instance Model Path</em>' attribute.
	 * @see #getSourceInstanceModelPath()
	 * @generated
	 */
	void setSourceInstanceModelPath(String value);

	/**
	 * Returns the value of the '<em><b>Source Instance Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The host name or IP address of the SourceInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Instance Host</em>' attribute.
	 * @see #setSourceInstanceHost(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstIndication_SourceInstanceHost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_InstIndication.SourceInstance\"]'"
	 * @generated
	 */
	String getSourceInstanceHost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstIndication#getSourceInstanceHost <em>Source Instance Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Instance Host</em>' attribute.
	 * @see #getSourceInstanceHost()
	 * @generated
	 */
	void setSourceInstanceHost(String value);

} // CIM_InstIndication
