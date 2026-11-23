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
 * A representation of the model object '<em><b>CIM Listener Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The description of a CIM Listener destination. A CIM_Listener is an entity capable of receiving CIM Export Messages (e.g., Indications or responses to an asynchronous CIM Operation).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getOtherPersistenceType <em>Other Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getOtherProtocol <em>Other Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getPassword <em>Password</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ListenerDestination#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Event' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ListenerDestination extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A System's CreationClassName. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * A System's Name. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getSystemName <em>System Name</em>}' attribute.
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
	 * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * Indicates the name of the CIM Listener destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the Persistence Type of the destination defined by this instance. If the value of PersistenceType is not specified, the value of PersistenceType MUST be treated as 2 ("Permanent"). A value of 2 ("Permanent") declares that the destination is always expected to be available (e.g., system log file). Inability to access this destination MUST be treated as an error condition. A value of 3 ("Transient") indicates that the destination is short-lived. Inability to access the destination MAY be treated as a normal termination condition. Subscriptions with "Transient" destinations MAY be deleted when the destination terminates or is no longer available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see #setPersistenceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_PersistenceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"Permanent\",\"Transient\"]' ModelCorrespondence='[\"CIM_ListenerDestination.OtherPersistenceType\"]'"
	 * @generated
	 */
	Integer getPersistenceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing ("Other") values for PersistenceType. This value MUST be set to a non NULL value when the PersistenceType is 1 ("Other"). For all other values of PersistenceType, the value of OtherPersistenceType MUST be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Persistence Type</em>' attribute.
	 * @see #setOtherPersistenceType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_OtherPersistenceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ListenerDestination.PersistenceType\"]'"
	 * @generated
	 */
	String getOtherPersistenceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getOtherPersistenceType <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Persistence Type</em>' attribute.
	 * @see #getOtherPersistenceType()
	 * @generated
	 */
	void setOtherPersistenceType(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The destination IETF URI to which Export Messages are to be delivered. The scheme in the URI must be supported by the protocol selected in the Protocol property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_Destination()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Other Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string providing a description of the supported protocols when 1, "Other", is specified for the Protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Protocol</em>' attribute.
	 * @see #setOtherProtocol(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_OtherProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ListenerDestination.Protocol\"]'"
	 * @generated
	 */
	String getOtherProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getOtherProtocol <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol</em>' attribute.
	 * @see #getOtherProtocol()
	 * @generated
	 */
	void setOtherProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Protocol describes an encoding and protocol which will be used to deliver the indication. If Other is used, the value for OtherProtocol must not be null.
	 * If a protocol is not specified, 2 "CIM-XML" must be assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_Protocol()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\"]' Values='[\"Other\",\"CIM-XML\",\"SM CLP\",\"WS-Management\",\"WSDM\",\"SMTP\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_ListenerDestination.OtherProtocol\"]'"
	 * @generated
	 */
	Integer getProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Integer value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The password required for connecting to the destination. If no password is required, this property may be left null. If this property is not null, the password shall be used when connecting to the destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_Password()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Read='false'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The username to use when connecting to the destination. If a username is not required this value may be null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestination_Username()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ListenerDestination#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // CIM_ListenerDestination
