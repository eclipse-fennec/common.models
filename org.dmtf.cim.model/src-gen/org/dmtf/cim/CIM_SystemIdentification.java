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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM System Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Namespace may represent data for one or many systems, that are local, remote (different than the system on which the ObjectManager is running) or aggregated. The System Identification class provides enough data to identify the system(s) represented in the Namespace. It is weak to the Namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getObjectManagerCreationClassName <em>Object Manager Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getObjectManagerName <em>Object Manager Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getNamespaceCreationClassName <em>Namespace Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getNamespaceName <em>Namespace Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getIdentificationFormats <em>Identification Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getFormatDescriptions <em>Format Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemIdentification#getIdentificationData <em>Identification Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Interop' keys='SystemCreationClassName,SystemName,ObjectManagerCreationClassName,ObjectManagerName,NamespaceCreationClassName,NamespaceName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SystemIdentification extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Namespace.SystemCreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemIdentification#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Namespace.SystemName'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemIdentification#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Object Manager Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ObjectManager's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Manager Creation Class Name</em>' attribute.
	 * @see #setObjectManagerCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_ObjectManagerCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Namespace.ObjectManagerCreationClassName'"
	 * @generated
	 */
	String getObjectManagerCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemIdentification#getObjectManagerCreationClassName <em>Object Manager Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Manager Creation Class Name</em>' attribute.
	 * @see #getObjectManagerCreationClassName()
	 * @generated
	 */
	void setObjectManagerCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Object Manager Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ObjectManager's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Manager Name</em>' attribute.
	 * @see #setObjectManagerName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_ObjectManagerName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Namespace.ObjectManagerName'"
	 * @generated
	 */
	String getObjectManagerName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemIdentification#getObjectManagerName <em>Object Manager Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Manager Name</em>' attribute.
	 * @see #getObjectManagerName()
	 * @generated
	 */
	void setObjectManagerName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Namespace's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace Creation Class Name</em>' attribute.
	 * @see #setNamespaceCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_NamespaceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Namespace.CreationClassName'"
	 * @generated
	 */
	String getNamespaceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemIdentification#getNamespaceCreationClassName <em>Namespace Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Creation Class Name</em>' attribute.
	 * @see #getNamespaceCreationClassName()
	 * @generated
	 */
	void setNamespaceCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Namespace's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace Name</em>' attribute.
	 * @see #setNamespaceName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_NamespaceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Namespace.Name'"
	 * @generated
	 */
	String getNamespaceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemIdentification#getNamespaceName <em>Namespace Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Name</em>' attribute.
	 * @see #getNamespaceName()
	 * @generated
	 */
	void setNamespaceName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemIdentification#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string uniquely identifying the name of the system represented in the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemIdentification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Identification Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the format of the system identification and/or addressing information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Formats</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_IdentificationFormats()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Unknown\",\"Other\",\"Short DNS Name\",\"Fully qualified DNS Name\",\"Windows Domain Name\",\"NetWare Server Name\",\"Unix Hostname\",\"Globally Unique System Identifier\",\"IP Address\",\"Modem Dialup String\",\"MAC Address\",\"IPMI Address\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SystemIdentification.IdentificationData\",\"CIM_SystemIdentification.FormatDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getIdentificationFormats();

	/**
	 * Returns the value of the '<em><b>Format Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strings further describing the format of the system identification information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_FormatDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SystemIdentification.IdentificationFormats\",\"CIM_SystemIdentification.IdentificationData\"]'"
	 * @generated
	 */
	EList<String> getFormatDescriptions();

	/**
	 * Returns the value of the '<em><b>Identification Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strings containing the system identification information. The format is described by the corresponding array item in IdentificationFormats.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Data</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemIdentification_IdentificationData()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SystemIdentification.IdentificationFormats\",\"CIM_SystemIdentification.FormatDescriptions\"]'"
	 * @generated
	 */
	EList<String> getIdentificationData();

} // CIM_SystemIdentification
