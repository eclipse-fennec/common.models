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
 * A representation of the model object '<em><b>CIM Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Namespace is deprecated. See CIM_WBEMServerNamespace as the replacement for this class.
 * Namespace provides a domain (in other words, a container), in which the instances [of a class] are guaranteed to be unique per the KEY qualifier definitions. It is named relative to the CIM_ObjectManager implementation that provides such a domain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getObjectManagerCreationClassName <em>Object Manager Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getObjectManagerName <em>Object Manager Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getClassInfo <em>Class Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getDescriptionOfClassInfo <em>Description Of Class Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getClassType <em>Class Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getClassTypeVersion <em>Class Type Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Namespace#getDescriptionOfClassType <em>Description Of Class Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Namespace()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_SchemaInformationStructure\"]' Version='2.39.0' UMLPackagePath='CIM::Interop' keys='SystemCreationClassName,SystemName,ObjectManagerCreationClassName,ObjectManagerName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Namespace extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ObjectManager.SystemCreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ObjectManager.SystemName'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getSystemName <em>System Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_ObjectManagerCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ObjectManager.CreationClassName'"
	 * @generated
	 */
	String getObjectManagerCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getObjectManagerCreationClassName <em>Object Manager Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_ObjectManagerName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ObjectManager.Name'"
	 * @generated
	 */
	String getObjectManagerName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getObjectManagerName <em>Object Manager Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Manager Name</em>' attribute.
	 * @see #getObjectManagerName()
	 * @generated
	 */
	void setObjectManagerName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * A string to uniquely identify the Namespace within the ObjectManager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the organization/schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Info</em>' attribute.
	 * @see #setClassInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_ClassInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_Namespace.ClassType\"]' Required='true' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"200\",\"201\",\"202\"]' Values='[\"Unknown\",\"Other\",\"CIM 1.0\",\"CIM 2.0\",\"CIM 2.1\",\"CIM 2.2\",\"CIM 2.3\",\"CIM 2.4\",\"CIM 2.5\",\"CIM 2.6\",\"CIM 2.7\",\"CIM 2.8\",\"DMI Recast\",\"SNMP Recast\",\"CMIP Recast\"]' ModelCorrespondence='[\"CIM_Namespace.DescriptionOfClassInfo\"]'"
	 * @generated
	 */
	Integer getClassInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getClassInfo <em>Class Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Info</em>' attribute.
	 * @see #getClassInfo()
	 * @generated
	 */
	void setClassInfo(Integer value);

	/**
	 * Returns the value of the '<em><b>Description Of Class Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Of Class Info</em>' attribute.
	 * @see #setDescriptionOfClassInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_DescriptionOfClassInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_Namespace.DescriptionOfClassType\"]' Write='true' ModelCorrespondence='[\"CIM_Namespace.ClassInfo\"]'"
	 * @generated
	 */
	String getDescriptionOfClassInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getDescriptionOfClassInfo <em>Description Of Class Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Of Class Info</em>' attribute.
	 * @see #getDescriptionOfClassInfo()
	 * @generated
	 */
	void setDescriptionOfClassInfo(String value);

	/**
	 * Returns the value of the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version or a mapping from another standard, such as SNMP. If 'Other' is selected, the DescriptionOfClassType property MUST be populated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Type</em>' attribute.
	 * @see #setClassType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_ClassType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_SchemaInformationStructure.Name\"]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"200\",\"201\",\"202\"]' Values='[\"Unknown\",\"Other\",\"CIM\",\"DMI Recast\",\"SNMP Recast\",\"CMIP Recast\"]' ModelCorrespondence='[\"CIM_Namespace.DescriptionOfClassType\",\"CIM_Namespace.ClassTypeVersion\"]'"
	 * @generated
	 */
	Integer getClassType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getClassType <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type</em>' attribute.
	 * @see #getClassType()
	 * @generated
	 */
	void setClassType(Integer value);

	/**
	 * Returns the value of the '<em><b>Class Type Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the objects in this namespace. The string representing the version MUST be in the form: 
	 * M + "." + N + "." + U 
	 * Where: 
	 * M - The major version (in numeric form) 
	 * N - The minor version (in numeric form) 
	 * U - The update (e.g. errata, patch, ..., in numeric form)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Type Version</em>' attribute.
	 * @see #setClassTypeVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_ClassTypeVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SchemaInformationStructure.Version\"]' Write='true' ModelCorrespondence='[\"CIM_Namespace.DescriptionOfClassType\",\"CIM_Namespace.ClassType\"]'"
	 * @generated
	 */
	String getClassTypeVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getClassTypeVersion <em>Class Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type Version</em>' attribute.
	 * @see #getClassTypeVersion()
	 * @generated
	 */
	void setClassTypeVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description Of Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Of Class Type</em>' attribute.
	 * @see #setDescriptionOfClassType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Namespace_DescriptionOfClassType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SchemaInformationStructure.Description\"]' Write='true' ModelCorrespondence='[\"CIM_Namespace.ClassType\",\"CIM_Namespace.ClassTypeVersion\"]'"
	 * @generated
	 */
	String getDescriptionOfClassType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Namespace#getDescriptionOfClassType <em>Description Of Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Of Class Type</em>' attribute.
	 * @see #getDescriptionOfClassType()
	 * @generated
	 */
	void setDescriptionOfClassType(String value);

} // CIM_Namespace
