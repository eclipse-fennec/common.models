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
 * A representation of the model object '<em><b>CIM Registered Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RegisteredSpecification is used to advertise the implementation of a specification within a WBEM server. The specification may be authored by the DMTF or another standards organization. In this context, specification is used to describe a named and versioned set of constraints. There may be a one to one correspondence between the set of constraints and the document in which they are published. An example of a one to one correspondence is the mechanism used by the DMTF to publish its profiles. An example of one to many documents to specifications is an SMI-S book published by SNIA.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredSpecification#getSpecificationType <em>Specification Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredSpecification#getOtherSpecificationType <em>Other Specification Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredSpecification#getRegisteredOrganization <em>Registered Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredSpecification#getOtherRegisteredOrganization <em>Other Registered Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredSpecification#getRegisteredName <em>Registered Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredSpecification#getRegisteredVersion <em>Registered Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredSpecification#getAdvertiseTypes <em>Advertise Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RegisteredSpecification#getAdvertiseTypeDescriptions <em>Advertise Type Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.39.0' UMLPackagePath='CIM::Interop' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID shall be constructed using the following \'preferred\' algorithm: \n: \nWhere and are separated by a colon \':\', and where shall include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the _ structure of Schema class names.) In addition, to ensure uniqueness, shall not contain a colon (\':\'). The first colon to appear in InstanceID shall appear between and . is chosen by the organizational entity and should not be re-used to identify different underlying (real-world) elements. \nFor DMTF defined instances, shall be set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RegisteredSpecification extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Specification Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification Type</em>' attribute.
	 * @see #setSpecificationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification_SpecificationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\"]' Values='[\"Other\",\"Profile\",\"Initiative Wrapper\",\"Mapping\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_RegisteredSpecification.OtherSpecificationType\"]'"
	 * @generated
	 */
	Integer getSpecificationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RegisteredSpecification#getSpecificationType <em>Specification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Type</em>' attribute.
	 * @see #getSpecificationType()
	 * @generated
	 */
	void setSpecificationType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Specification Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherSpecificationType shall be a a free-form string providing a description of the specification type if 1, "Other" is specified for the SpecificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Specification Type</em>' attribute.
	 * @see #setOtherSpecificationType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification_OtherSpecificationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_RegisteredSpecification.SpecificationType\"]'"
	 * @generated
	 */
	String getOtherSpecificationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RegisteredSpecification#getOtherSpecificationType <em>Other Specification Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Specification Type</em>' attribute.
	 * @see #getOtherSpecificationType()
	 * @generated
	 */
	void setOtherSpecificationType(String value);

	/**
	 * Returns the value of the '<em><b>Registered Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that defines this specification. 
	 * "The Green Grid" identifies "The Green Grid Association"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registered Organization</em>' attribute.
	 * @see #setRegisteredOrganization(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification_RegisteredOrganization()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"..\"]' Values='[\"Other\",\"DMTF\",\"CompTIA\",\"Consortium for Service Innovation\",\"FAST\",\"GGF\",\"INTAP\",\"itSMF\",\"NAC\",\"Northwest Energy Efficiency Alliance\",\"SNIA\",\"TM Forum\",\"The Open Group\",\"ANSI\",\"IEEE\",\"IETF\",\"INCITS\",\"ISO\",\"W3C\",\"OGF\",\"The Green Grid\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_RegisteredSpecification.OtherRegisteredOrganization\"]'"
	 * @generated
	 */
	Integer getRegisteredOrganization();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RegisteredSpecification#getRegisteredOrganization <em>Registered Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Organization</em>' attribute.
	 * @see #getRegisteredOrganization()
	 * @generated
	 */
	void setRegisteredOrganization(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Registered Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherRegisteredOrganization shall be a a free-form string providing a description of the organization if 1, "Other" is specified for the RegisteredOrganization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Registered Organization</em>' attribute.
	 * @see #setOtherRegisteredOrganization(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification_OtherRegisteredOrganization()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_RegisteredSpecification.RegisteredOrganization\"]'"
	 * @generated
	 */
	String getOtherRegisteredOrganization();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RegisteredSpecification#getOtherRegisteredOrganization <em>Other Registered Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Registered Organization</em>' attribute.
	 * @see #getOtherRegisteredOrganization()
	 * @generated
	 */
	void setOtherRegisteredOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Registered Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of this registered specification. Since multiple versions can exist for the same RegisteredName, the combination of RegisteredName, RegisteredOrganization, and RegisteredVersion shall uniquely identify the registered specification within the scope of the organization. 
	 * The value of this property shall correspond to the name given to the set of versioned constraints by a specification or standard. The value does not identify the name of the document or publishing media, unless it happens to be the same as the name given to the versioned constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registered Name</em>' attribute.
	 * @see #setRegisteredName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification_RegisteredName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getRegisteredName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RegisteredSpecification#getRegisteredName <em>Registered Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Name</em>' attribute.
	 * @see #getRegisteredName()
	 * @generated
	 */
	void setRegisteredName(String value);

	/**
	 * Returns the value of the '<em><b>Registered Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version describing the creation or last modificationof the specification. The string representing the version shall be in the form: 
	 * M + "." + N + "." + U 
	 * Where: 
	 * M - The major version (in numeric form). 
	 * N - The minor version (in numeric form). 
	 * U - The update (e.g. errata, patch, ..., in numeric form).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registered Version</em>' attribute.
	 * @see #setRegisteredVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification_RegisteredVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getRegisteredVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RegisteredSpecification#getRegisteredVersion <em>Registered Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Version</em>' attribute.
	 * @see #getRegisteredVersion()
	 * @generated
	 */
	void setRegisteredVersion(String value);

	/**
	 * Returns the value of the '<em><b>Advertise Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the requested network advertisement for specification information. It is used by the advertising services of the WBEM infrastructure to determine what should be advertised, via what mechanisms. The property is an array so that the specification may be advertised using several mechanisms. If an array entry has a value of 2 (Not Advertised), this shall be the only array entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Advertise Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification_AdvertiseTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Not Advertised\",\"SLP\",\"WS-Identify\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RegisteredSpecification.AdvertiseTypeDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getAdvertiseTypes();

	/**
	 * Returns the value of the '<em><b>Advertise Type Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string identifying the requested network advertisement for specification information for cases where the predefined values in AdvertiseTypes are not sufficient. Each entry in this array corresponds to the entry in the AdvertiseTypes array at the same index, and the two arrays shall have the same number of entries. A non-Null value shall be provided for each array entry that corresponds to an AdvertiseTypes entry with a value of 1 (Other). Other array entries should be Null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Advertise Type Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RegisteredSpecification_AdvertiseTypeDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RegisteredSpecification.AdvertiseTypes\"]'"
	 * @generated
	 */
	EList<String> getAdvertiseTypeDescriptions();

} // CIM_RegisteredSpecification
