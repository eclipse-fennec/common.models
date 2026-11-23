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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Associated Privilege</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AssociatedPrivilege is an association that models the privileges that a Subject element has to access or authorize other elements to access a Target element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPrivilege#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPrivilege#getTarget <em>Target</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPrivilege#getUseKey <em>Use Key</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPrivilege#getPrivilegeGranted <em>Privilege Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPrivilege#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPrivilege#getActivityQualifiers <em>Activity Qualifiers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPrivilege#getQualifierFormats <em>Qualifier Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedPrivilege#getRepresentsAuthorizationRights <em>Represents Authorization Rights</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::User::Privilege' keys='Subject,Target,UseKey'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedPrivilege extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Subject for which privileges are granted or denied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege_Subject()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getSubject();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPrivilege#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target element to which the privileges apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege_Target()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getTarget();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPrivilege#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Use Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UseKey is used to distinguish instances in case multiple instances of this association exist between the same Subject and Target. This may arise, for example, if separate instances are created for each management domain, or if the Subject has access and authorization rights to the Target.
	 * Within the scope of the instantiating Namespace, UseKey opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of UseKey should be constructed using the following 'preferred' algorithm: 
	 * <OrgID>:<LocalID> 
	 * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> shall include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the UseKey, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> shall not contain a colon (':'). When using this algorithm, the first colon to appear in UseKey shall appear between <OrgID> and <LocalID>. 
	 * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity shall assure that the resultant UseKey is not re-used across any UseKeys produced by this or other providers for this instance's NameSpace. 
	 * For DMTF defined instances, the 'preferred' algorithm shall be used with the <OrgID> set to 'CIM'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Key</em>' attribute.
	 * @see #setUseKey(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege_UseKey()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getUseKey();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPrivilege#getUseKey <em>Use Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Key</em>' attribute.
	 * @see #getUseKey()
	 * @generated
	 */
	void setUseKey(String value);

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
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege_PrivilegeGranted()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPrivilegeGranted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPrivilege#getPrivilegeGranted <em>Privilege Granted</em>}' attribute.
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
	 * An enumeration indicating the activities that are granted or denied. These activities apply to all entities specified in the ActivityQualifiers array.
	 * "Other" (1): indicates an activity that is not specified in this enumeration.
	 * "Create" (2), "Delete" (3), "Detect" (4), "Read" (5), "Write" (6), "Execute" (7): each of these values indicates that the Subject is permitted to use an operation supported by the Target. They are all straightforward except for one, 4="Detect". This value indicates that the existence or presence of an entity may be determined, but not necessarily specific data (which requires the Read privilege to be true). This activity is exemplified by 'hidden files'- if you list the contents of a directory, you will not see hidden files. However, if you know a specific file name, or know how to expose hidden files, then they can be 'detected'. Another example is the ability to define search privileges in directory implementations.
	 * "Deny Create" (8), "Deny Delete" (9), "Deny Detect" (10), "Deny Read" (11), "Deny Write" (12), "Deny Execute" (13): each of these values indicates that the Subject is expressly denied permission to use an operation supported by the Target.
	 * Authorize to Grant/Deny Authorization (14): this value indicates that the Subject is permitted to add any of the following values to - or remove any of the following values from - the Activities array property in any other instance of CIM_AssociatedPrivilege that references the same Target: "Authorize to Create" (15), "Authorize to Delete" (16), "Authorize to Detect" (17), "Authorize to Read" (18), "Authorize to Write" (19), "Authorize to Execute" (20), "Authorize to Deny Create" (21), "Authorize to Deny Delete" (22), "Authorize to Deny Detect" (23), "Authorize to Deny Read" (24), "Authorize to Deny Write" (25), and "Authorize to Deny Execute" (26).
	 * "Authorize to Create" (15), "Authorize to Delete" (16), "Authorize to Detect" (17), "Authorize to Read" (18), "Authorize to Write" (19), "Authorize to Execute" (20), "Authorize to Deny Create" (21), "Authorize to Deny Delete" (22), "Authorize to Deny Detect" (23), "Authorize to Deny Read" (24), "Authorize to Deny Write" (25), and "Authorize to Deny Execute" (26): each of these values indicates that the Subject is permitted to add value named in the string to - or remove the value from - the Activities array property in any other instance of CIM_AssociatedPrivilege that references the same Target. For example, "Authorize to Read" indicates that the Subject is permitted to add or remove the value "Read", and "Authorize to Deny Read" indicates that the Subject is permitted to add or remove the value "Deny Read".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege_Activities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"..\",\"16000..\"]' Values='[\"Other\",\"Create\",\"Delete\",\"Detect\",\"Read\",\"Write\",\"Execute\",\"Deny Create\",\"Deny Delete\",\"Deny Detect\",\"Deny Read\",\"Deny Write\",\"Deny Execute\",\"Authorize to Grant/Deny Authorization\",\"Authorize to Create\",\"Authorize to Delete\",\"Authorize to Detect\",\"Authorize to Read\",\"Authorize to Write\",\"Authorize to Execute\",\"Authorize to Deny Create\",\"Authorize to Deny Delete\",\"Authorize to Deny Detect\",\"Authorize to Deny Read\",\"Authorize to Deny Write\",\"Authorize to Deny Execute\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AssociatedPrivilege.ActivityQualifiers\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege_ActivityQualifiers()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AssociatedPrivilege.Activities\",\"CIM_AssociatedPrivilege.QualifierFormats\"]'"
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
	 * - 12=Specification-defined. The semantics are defined in a a specification produced by the DMTF or other organization. The value of the corresponding ActivityQualifiers entry names the specification and the organization that produced it, and includes a label that unambiguously references the semantic definition within the specification. The value of of the corresponding ActivityQualifiers entry should be constructed using the following "preferred" algorithm: 
	 * <OrgID>:<SpecID>:<Label>, where <OrgID>, <SpecID>, and <Label> are separated by a colon (:), and where <OrgID> shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness both <OrgID> and <SpecID> shall not contain a colon (':'). When using this algorithm, the first colon to appear in the corresponding ActivityQualifiers entry shall appear between <OrgID> and <SpecID> and the second colon to appear in the corresponding ActivityQualifiers entry shall appear between <SpecID> and <Label>. 
	 * <Label> is chosen by the business entity and should not be reused to identify different underlying semantics. If the above "preferred" algorithm is not used, the defining entity must assure that the resulting value is not reused to refer to a different specification or different semantics within defined within the same specification.
	 * For DMTF-defined instances, the "preferred" algorithm shall be used with the <OrgID> set to "DMTF", and the <SpecID> set to "DSPx", where x is the number of a DSP published by the DMTF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier Formats</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege_QualifierFormats()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"16000..\"]' Values='[\"Class Name\",\"&lt;Class.&gt;Property\",\"&lt;Class.&gt;Method\",\"Object Reference\",\"Namespace\",\"URL\",\"Directory/File Name\",\"Command Line Instruction\",\"SCSI Command\",\"Packets\",\"Specification-defined\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AssociatedPrivilege.ActivityQualifiers\"]'"
	 * @generated
	 */
	EList<Integer> getQualifierFormats();

	/**
	 * Returns the value of the '<em><b>Represents Authorization Rights</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RepresentsAuthorizationRights flag indicates whether the rights defined by this instance shall be interpreted as rights of Subjects to access Targets or as rights of Subjects to change those rights on/for Targets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents Authorization Rights</em>' attribute.
	 * @see #setRepresentsAuthorizationRights(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedPrivilege_RepresentsAuthorizationRights()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRepresentsAuthorizationRights();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedPrivilege#getRepresentsAuthorizationRights <em>Represents Authorization Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents Authorization Rights</em>' attribute.
	 * @see #getRepresentsAuthorizationRights()
	 * @generated
	 */
	void setRepresentsAuthorizationRights(Boolean value);

} // CIM_AssociatedPrivilege
