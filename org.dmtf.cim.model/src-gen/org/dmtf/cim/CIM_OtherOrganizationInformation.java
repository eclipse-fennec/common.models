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
 * A representation of the model object '<em><b>CIM Other Organization Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OtherOrganizationInformation class is used to provide additional information about an associated Organization instance. This class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getDestinationIndicator <em>Destination Indicator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getInternationaliSDNNumber <em>Internationali SDN Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getLabeledURI <em>Labeled URI</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getMail <em>Mail</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getManager <em>Manager</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getOtherMailbox <em>Other Mailbox</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getPhysicalDeliveryOfficeName <em>Physical Delivery Office Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getPostOfficeBox <em>Post Office Box</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getPreferredDeliveryMethod <em>Preferred Delivery Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getRegisteredAddress <em>Registered Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getSearchGuide <em>Search Guide</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getStreet <em>Street</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getTeletexTerminalIdentifier <em>Teletex Terminal Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getTelexNumber <em>Telex Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getThumbnailLogo <em>Thumbnail Logo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getUserPassword <em>User Password</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getX121Address <em>X121 Address</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::User::Org' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OtherOrganizationInformation extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getName <em>Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_ObjectClass()
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
	 * This property describes the kind of business performed by an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_BusinessCategory()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getBusinessCategory();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Descriptions property values may contain human-readable descriptions of the object. In the case of an LDAP-derived instance, the description attribute may have multiple values that, therefore, cannot be placed in the inherited Description property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_Descriptions()
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
	 * This property is used for the organization's telegram service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Indicator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_DestinationIndicator()
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
	 * The organization's facsimile telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facsimile Telephone Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_FacsimileTelephoneNumber()
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
	 * The organization's International ISDN number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internationali SDN Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_InternationaliSDNNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='16'"
	 * @generated
	 */
	EList<String> getInternationaliSDNNumber();

	/**
	 * Returns the value of the '<em><b>Labeled URI</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uniform Resource Identifier with optional label as defined in RFC2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labeled URI</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_LabeledURI()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getLabeledURI();

	/**
	 * Returns the value of the '<em><b>Locality Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the name of a locality, such as a city, county or other geographic region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_LocalityName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getLocalityName();

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the mail box addresses for the organization as defined in RFC822.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_Mail()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getMail();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manager for the organization. In the case of an LDAP-derived instance, the Manager property value may contain the distinguished name of the Manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manager</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_Manager()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getManager();

	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_OrganizationName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOrganizationName();

	/**
	 * Returns the value of the '<em><b>Other Mailbox</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, this property may be used for electronic mail box addresses other than RFC822 and X.400.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Mailbox</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_OtherMailbox()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOtherMailbox();

	/**
	 * Returns the value of the '<em><b>Physical Delivery Office Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PhysicalDeliveryOfficeName property specifies the name of the city, village, etc. where a physical delivery office is situated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Delivery Office Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_PhysicalDeliveryOfficeName()
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
	 * The PostalAddress property values specify the address information required for the physical delivery of postal messages by the postal authority to the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_PostalAddress()
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
	 * The PostalCode property specifies the postal code of the organization. If this value is present it will be part of the object's postal address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_PostalCode()
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
	 * The PostOfficeBox property specifies the PO box by which the organization will receive physical postal delivery. If present, the property value is part of the object's postal address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Office Box</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_PostOfficeBox()
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
	 * The PreferredDeliveryMethod property specifies the organization's preferred method to be used for communicating with it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Delivery Method</em>' attribute.
	 * @see #setPreferredDeliveryMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_PreferredDeliveryMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPreferredDeliveryMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherOrganizationInformation#getPreferredDeliveryMethod <em>Preferred Delivery Method</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_RegisteredAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getRegisteredAddress();

	/**
	 * Returns the value of the '<em><b>Search Guide</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property value is for use by X.500 clients in constructing search filters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Guide</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_SearchGuide()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSearchGuide();

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the SeeAlso property specifies distinguishedName of other Directory objects which may be other aspects (in some sense) of the same real world object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>See Also</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_SeeAlso()
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
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_StateOrProvince()
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
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_Street()
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
	 * The TelephoneNumber property specifies a telephone number of the organization, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_TelephoneNumber()
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
	 * The TeletexTerminalIdentifier property specifies the Teletex terminal identifier (and, optionally, parameters) for a teletex terminal associated with the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teletex Terminal Identifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_TeletexTerminalIdentifier()
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
	 * The TelexNumber property specifies the telex number, country code, and answerback code of a telex terminal for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telex Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_TelexNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getTelexNumber();

	/**
	 * Returns the value of the '<em><b>Thumbnail Logo</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An image of the organization logo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thumbnail Logo</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_ThumbnailLogo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getThumbnailLogo();

	/**
	 * Returns the value of the '<em><b>Unique Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier that may be assigned in an environment to differentiate between uses of a given named organization instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Identifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_UniqueIdentifier()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getUniqueIdentifier();

	/**
	 * Returns the value of the '<em><b>User Password</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the UserPassword property may contain an encrypted password used to access the organization's resources in a directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Password</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_UserPassword()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getUserPassword();

	/**
	 * Returns the value of the '<em><b>X121 Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An X.121 address for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X121 Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherOrganizationInformation_X121Address()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='15'"
	 * @generated
	 */
	EList<String> getX121Address();

} // CIM_OtherOrganizationInformation
