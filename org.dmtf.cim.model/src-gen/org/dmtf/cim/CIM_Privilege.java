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
 * A representation of the model object '<em><b>CIM Privilege</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Privilege is the base class for all types of activities which are granted or denied by a Role or an Identity. Whether an individual Privilege is granted or denied is defined using the PrivilegeGranted boolean. Any Privileges not specifically granted are assumed to be denied. An explicit deny (Privilege Granted = FALSE) takes precedence over any granted Privileges. 
 * 
 * The association of subjects (Roles and Identities) to Privileges is accomplished using policy or explicitly via the associations on a subclass. The entities that are protected (targets) can be similarly defined. 
 * 
 * Note that Privileges may be inherited through hierarchical Roles, or may overlap. For example, a Privilege denying any instance Writes in a particular CIM Server Namespace would overlap with a Privilege defining specific access rights at an instance level within that Namespace. In this example, the AuthorizedSubjects are either Identities or Roles, and the AuthorizedTargets are a Namespace in the former case, and a particular instance in the latter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Privilege#getPrivilegeGranted <em>Privilege Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Privilege#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Privilege#getActivityQualifiers <em>Activity Qualifiers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Privilege#getQualifierFormats <em>Qualifier Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Privilege#getRepresentsAuthorizationRights <em>Represents Authorization Rights</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Privilege()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.20.0' UMLPackagePath='CIM::User::Privilege' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. For DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_Privilege extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Privilege Granted</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the Privilege is granted (TRUE) or denied (FALSE). The default is to grant permission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Privilege Granted</em>' attribute.
	 * @see #setPrivilegeGranted(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Privilege_PrivilegeGranted()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPrivilegeGranted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Privilege#getPrivilegeGranted <em>Privilege Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege Granted</em>' attribute.
	 * @see #getPrivilegeGranted()
	 * @generated
	 */
	void setPrivilegeGranted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the activities that are granted or denied. These activities apply to all entities specified in the ActivityQualifiers array. The values in the enumeration are straightforward except for one, 4="Detect". This value indicates that the existence or presence of an entity may be determined, but not necessarily specific data (which requires the Read privilege to be true). This activity is exemplified by 'hidden files'- if you list the contents of a directory, you will not see hidden files. However, if you know a specific file name, or know how to expose hidden files, then they can be 'detected'. Another example is the ability to define search privileges in directory implementations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Privilege_Activities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"16000..\"]' Values='[\"Other\",\"Create\",\"Delete\",\"Detect\",\"Read\",\"Write\",\"Execute\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Privilege.ActivityQualifiers\"]'"
	 * @generated
	 */
	EList<Integer> getActivities();

	/**
	 * Returns the value of the '<em><b>Activity Qualifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityQualifiers property is an array of string values used to further qualify and specify the privileges granted or denied. For example, it is used to specify a set of files for which 'Read'/'Write' access is permitted or denied. Or, it defines a class' methods that may be 'Executed'. Details on the semantics of the individual entries in ActivityQualifiers are provided by corresponding entries in the QualifierFormats array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Qualifiers</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Privilege_ActivityQualifiers()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Privilege.Activities\",\"CIM_Privilege.QualifierFormats\"]'"
	 * @generated
	 */
	EList<String> getActivityQualifiers();

	/**
	 * Returns the value of the '<em><b>Qualifier Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the semantics of corresponding entries in the ActivityQualifiers array. An example of each of these 'formats' and their use follows: 
	 * - 2=Class Name. Example: If the authorization target is a CIM Service or a Namespace, then the ActivityQualifiers entries can define a list of classes that the authorized subject is able to create or delete. 
	 * - 3=<Class.>Property. Example: If the authorization target is a CIM Service, Namespace or Collection of instances, then the ActivityQualifiers entries can define the class properties that may or may not be accessed. In this case, the class names are specified with the property names to avoid ambiguity - since a CIM Service, Namespace or Collection could manage multiple classes. On the other hand, if the authorization target is an individual instance, then there is no possible ambiguity and the class name may be omitted. To specify ALL properties, the wildcard string "*" should be used. 
	 * - 4=<Class.>Method. This example is very similar to the Property one, above. And, as above, the string "*" may be specified to select ALL methods. 
	 * - 5=Object Reference. Example: If the authorization target is a CIM Service or Namespace, then the ActivityQualifiers entries can define a list of object references (as strings) that the authorized subject can access. 
	 * - 6=Namespace. Example: If the authorization target is a CIM Service, then the ActivityQualifiers entries can define a list of Namespaces that the authorized subject is able to access. 
	 * - 7=URL. Example: An authorization target may not be defined, but a Privilege could be used to deny access to specific URLs by individual Identities or for specific Roles, such as the 'under 17' Role. 
	 * - 8=Directory/File Name. Example: If the authorization target is a FileSystem, then the ActivityQualifiers entries can define a list of directories and files whose access is protected. 
	 * - 9=Command Line Instruction. Example: If the authorization target is a ComputerSystem or Service, then the ActivityQualifiers entries can define a list of command line instructions that may or may not be 'Executed' by the authorized subjects. 
	 * - 10=SCSI Command, using a format of 'CDB=xx[,Page=pp]'. For example, the ability to select the VPD page of the Inquiry command is encoded as 'CDB=12,Page=83' in the corresponding ActivityQualifiers entry. A '*' may be used to indicate all CDBs or Page numbers. 
	 * - 11=Packets. Example: The transmission of packets is permitted or denied by the Privilege for the target (a ComputerSystem, ProtocolEndpoint, Pipe, or other ManagedSystemElement).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier Formats</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Privilege_QualifierFormats()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"16000..\"]' Values='[\"Class Name\",\"&lt;Class.&gt;Property\",\"&lt;Class.&gt;Method\",\"Object Reference\",\"Namespace\",\"URL\",\"Directory/File Name\",\"Command Line Instruction\",\"SCSI Command\",\"Packets\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Privilege.ActivityQualifiers\"]'"
	 * @generated
	 */
	EList<Integer> getQualifierFormats();

	/**
	 * Returns the value of the '<em><b>Represents Authorization Rights</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RepresentsAuthorizationRights flag indicates whether the rights defined by this instance should be interpreted as rights of Subjects to access Targets or as rights of Subjects to change those rights on/for Targets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents Authorization Rights</em>' attribute.
	 * @see #setRepresentsAuthorizationRights(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Privilege_RepresentsAuthorizationRights()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRepresentsAuthorizationRights();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Privilege#getRepresentsAuthorizationRights <em>Represents Authorization Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents Authorization Rights</em>' attribute.
	 * @see #getRepresentsAuthorizationRights()
	 * @generated
	 */
	void setRepresentsAuthorizationRights(Boolean value);

} // CIM_Privilege
