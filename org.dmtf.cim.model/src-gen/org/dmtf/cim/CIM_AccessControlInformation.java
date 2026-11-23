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
 * A representation of the model object '<em><b>CIM Access Control Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AccessControlInformation provides, through its properties and its associations, the specification of the access rights granted to a set of subject users to a set of target resources. The AccessControlInformation class is weak to the system (e.g., Computer System or Administrative Domain) for which the access controls apply. 
 * 
 * This class is deprecated in lieu of two others: AuthorizedPrivilege (defining specific access details) and SecuritySensitivity (defining individual security levels). The reasons for this are: 1. More specific access details are defined in Privilege (the superclass of AuthorizedPrivilege); and, 2. SecuritySensitivity allows security levels to be applied to other elements than access control information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AccessControlInformation#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccessControlInformation#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccessControlInformation#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccessControlInformation#getSecurityClassification <em>Security Classification</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccessControlInformation#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccessControlInformation#getAccessQualifier <em>Access Qualifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccessControlInformation#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AccessControlInformation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_AuthorizedPrivilege\",\"CIM_SecuritySensitivity\"]' Version='2.8.0' UMLPackagePath='CIM::User::AccessControl' override.Name='string' override.Name.Deprecated='[\"CIM_AuthorizedPrivilege.InstanceID\"]' override.Name.Key='true' override.Name.Description='The Name property defines the unique label, in the context of the hosting system, by which the AccessControlInformation is known.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AccessControlInformation extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hosting system creation class name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccessControlInformation_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_System.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccessControlInformation#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * Hosting system name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccessControlInformation_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_System.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccessControlInformation#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccessControlInformation_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccessControlInformation#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Security Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SecurityClassification property specifies a named level of security associated with the AccessControlInformation, e.g., 'Confidential', 'Top Secret', etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Classification</em>' attribute.
	 * @see #setSecurityClassification(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccessControlInformation_SecurityClassification()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SecuritySensitivity.SecurityLevel\"]'"
	 * @generated
	 */
	String getSecurityClassification();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccessControlInformation#getSecurityClassification <em>Security Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Classification</em>' attribute.
	 * @see #getSecurityClassification()
	 * @generated
	 */
	void setSecurityClassification(String value);

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AccessType property is an array of string values that specifies the type of access for which the corresponding permission applies. For example, it can be used to specify a generic access such as 'Read-only', 'Read/Write', etc. for file or record access control or it can be used to specifiy an entry point name for service access control.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AccessControlInformation_AccessType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_AuthorizedPrivilege.Activities\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AccessControlInformation.AccessQualifier\",\"CIM_AccessControlInformation.Permission\"]'"
	 * @generated
	 */
	EList<String> getAccessType();

	/**
	 * Returns the value of the '<em><b>Access Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AccessQualifier property is an array of string values may be used to further qualify the type of access for which the corresponding permission applies. For example, it may be used to specify a set of parameters that are permitted or denied in conjunction with the corresponding AccessType entry point name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Qualifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AccessControlInformation_AccessQualifier()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_AuthorizedPrivilege.ActivityQualifiers\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AccessControlInformation.AccessType\",\"CIM_AccessControlInformation.Permission\"]'"
	 * @generated
	 */
	EList<String> getAccessQualifier();

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Permission property is an array of string values indicating the permission that applies to the corresponding AccessType and AccessQualifier array values. The values may be extended in subclasses to provide more specific access controls. 
	 * 
	 * This property is deprecated in lieu of the general AuthorizedPrivilege class. This is because the Permissions, 'Access' and 'Deny', are addressed by the PrivilegeGranted property, while 'Manage' maps to specific activities with their corresponding qualifiers and formats.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permission</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AccessControlInformation_Permission()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_AuthorizedPrivilege\"]' ValueMap='[\"Unknown\",\"Allow\",\"Deny\",\"Manage\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AccessControlInformation.AccessType\",\"CIM_AccessControlInformation.AccessQualifier\"]'"
	 * @generated
	 */
	EList<String> getPermission();

} // CIM_AccessControlInformation
