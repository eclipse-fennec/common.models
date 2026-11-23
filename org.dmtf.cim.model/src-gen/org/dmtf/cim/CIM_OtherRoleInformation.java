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
 * A representation of the model object '<em><b>CIM Other Role Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OtherRoleInformation class is used to provide additional information about an associated Role instance. This class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getDestinationIndicator <em>Destination Indicator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getInternationaliSDNNumber <em>Internationali SDN Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getPhysicalDeliveryOfficeName <em>Physical Delivery Office Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getPostOfficeBox <em>Post Office Box</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getPreferredDeliveryMethod <em>Preferred Delivery Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getRegisteredAddress <em>Registered Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getStreet <em>Street</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getTeletexTerminalIdentifier <em>Teletex Terminal Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getTelexNumber <em>Telex Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherRoleInformation#getX121Address <em>X121 Address</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::User::Role' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OtherRoleInformation extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherRoleInformation#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * The Name property defines the label by which the object is known. In the case of an LDAP-derived instance, the Name property value may be set to the distinguished name of the LDAP-accessed object instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherRoleInformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the ObjectClass property value(s) may be set to the objectClass attribute values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_ObjectClass()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getObjectClass();

	/**
	 * Returns the value of the '<em><b>Business Category</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property may be used to describe the kind of business activity performed by the members (role occupants) in the position or set of responsibilities represented by the Role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_BusinessCategory()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getBusinessCategory();

	/**
	 * Returns the value of the '<em><b>Common Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CommonName is a (possibly ambiguous) name by which the role is commonly known in some limited scope (such as an organization) and conforms to the naming conventions of the country or culture with which it is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_CommonName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCommonName();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Descriptions property values may contain human-readable descriptions of the object. In the case of an LDAP-derived instance, the description attribute may have multiple values that, therefore, cannot be placed in the inherited Description property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_Descriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='1024'"
	 * @generated
	 */
	EList<String> getDescriptions();

	/**
	 * Returns the value of the '<em><b>Destination Indicator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used for the role occupants' telegram service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Indicator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_DestinationIndicator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getDestinationIndicator();

	/**
	 * Returns the value of the '<em><b>Facsimile Telephone Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role occupants' facsimile telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facsimile Telephone Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_FacsimileTelephoneNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getFacsimileTelephoneNumber();

	/**
	 * Returns the value of the '<em><b>Internationali SDN Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role occupants' International ISDN number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internationali SDN Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_InternationaliSDNNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='16'"
	 * @generated
	 */
	EList<String> getInternationaliSDNNumber();

	/**
	 * Returns the value of the '<em><b>OU</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an organizational unit related to the role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OU</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_OU()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOU();

	/**
	 * Returns the value of the '<em><b>Physical Delivery Office Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PhysicalDeliveryOfficeName property specifies the name of the city, village, etc. where a physical delivery office is situated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Delivery Office Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_PhysicalDeliveryOfficeName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getPhysicalDeliveryOfficeName();

	/**
	 * Returns the value of the '<em><b>Postal Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostalAddress property values specify the address information required for the physical delivery of postal messages by the postal authority to the role occupants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_PostalAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPostalAddress();

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostalCode property specifies the postal code for the role occupants. If this value is present it will be part of the object's postal address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_PostalCode()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='40'"
	 * @generated
	 */
	EList<String> getPostalCode();

	/**
	 * Returns the value of the '<em><b>Post Office Box</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostOfficeBox property specifies the PO box by which the role occupants will receive physical postal delivery. If present, the property value is part of the object's postal address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Office Box</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_PostOfficeBox()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='40'"
	 * @generated
	 */
	EList<String> getPostOfficeBox();

	/**
	 * Returns the value of the '<em><b>Preferred Delivery Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PreferredDeliveryMethod property specifies the role occupants' preferred method to be used for contacting them in their role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Delivery Method</em>' attribute.
	 * @see #setPreferredDeliveryMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_PreferredDeliveryMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPreferredDeliveryMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherRoleInformation#getPreferredDeliveryMethod <em>Preferred Delivery Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Delivery Method</em>' attribute.
	 * @see #getPreferredDeliveryMethod()
	 * @generated
	 */
	void setPreferredDeliveryMethod(String value);

	/**
	 * Returns the value of the '<em><b>Registered Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies a postal address suitable for receipt of telegrams or expedited documents, where it is necessary to have the recipient accept delivery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registered Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_RegisteredAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getRegisteredAddress();

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the SeeAlso property specifies distinguished name of other Directory objects which may be other aspects (in some sense) of the same real world object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>See Also</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_SeeAlso()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSeeAlso();

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State or Province name property specifies a state or province.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_StateOrProvince()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getStateOrProvince();

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Street address property specifies a site for the local distribution and physical delivery in a postal address, i.e. the street name, place, avenue, and the number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_Street()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getStreet();

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TelephoneNumber property specifies a telephone number of the role occupants, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_TelephoneNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='32'"
	 * @generated
	 */
	EList<String> getTelephoneNumber();

	/**
	 * Returns the value of the '<em><b>Teletex Terminal Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TeletexTerminalIdentifier property specifies the Teletex terminal identifier (and, optionally, parameters) for a teletex terminal associated with the role occupants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teletex Terminal Identifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_TeletexTerminalIdentifier()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getTeletexTerminalIdentifier();

	/**
	 * Returns the value of the '<em><b>Telex Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TelexNumber property specifies the telex number, country code, and answerback code of a telex terminal for the role occupants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telex Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_TelexNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getTelexNumber();

	/**
	 * Returns the value of the '<em><b>X121 Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An X.121 address for the role occupants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X121 Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherRoleInformation_X121Address()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='15'"
	 * @generated
	 */
	EList<String> getX121Address();

} // CIM_OtherRoleInformation
