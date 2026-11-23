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
 * A representation of the model object '<em><b>CIM Zone Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ZoneService if responsible for managing the Zone enforcement for the fabric. The ZoneService is hosted on an AdminDomain. This relationship is depicted by the HostedService association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ZoneService#getSessionState <em>Session State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneService#getRequestedSessionState <em>Requested Session State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneService#getDefaultZoningState <em>Default Zoning State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ZoneService#getConfigurationID <em>Configuration ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ZoneService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.46.0' UMLPackagePath='CIM::Device::FC' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ZoneService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Session State</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SessionState is an integer enumeration that indicates whether the session is currently starting (value=2) or has ended (value=3). It is possible that a particular instance of a ZoneService might not support sessions. If sessions are not supported, the value 4 ("Not Applicable") is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session State</em>' attribute.
	 * @see #setSessionState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneService_SessionState()
	 * @model default="4"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Starting\",\"Ended\",\"Not Applicable\"]'"
	 * @generated
	 */
	Integer getSessionState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneService#getSessionState <em>Session State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session State</em>' attribute.
	 * @see #getSessionState()
	 * @generated
	 */
	void setSessionState(Integer value);

	/**
	 * Returns the value of the '<em><b>Requested Session State</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestedSessionState is an integer enumeration that indicates whether the ZoneService session has been requested to start (value=2), end (value=3), or terminate (value=4). Note that when RequestedSessionState is set to 4 ("Not Applicable"), then this property is not used. By default, the RequestedSessionState of the element is 5 ("No Change").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Session State</em>' attribute.
	 * @see #setRequestedSessionState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneService_RequestedSessionState()
	 * @model default="5"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"Start\",\"End\",\"Terminate\",\"No Change\"]' ModelCorrespondence='[\"CIM_ZoneService.SessionState\",\"CIM_ZoneService.SessionControl\"]'"
	 * @generated
	 */
	Integer getRequestedSessionState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneService#getRequestedSessionState <em>Requested Session State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Session State</em>' attribute.
	 * @see #getRequestedSessionState()
	 * @generated
	 */
	void setRequestedSessionState(Integer value);

	/**
	 * Returns the value of the '<em><b>Default Zoning State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DefaultZoningState indicates whether fabric members (devices) that are not in any other active Zones can access each other. In particular, if no Zones are active, a DefaultZoningState "Allow" indicates that all fabric members can access each other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Zoning State</em>' attribute.
	 * @see #setDefaultZoningState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneService_DefaultZoningState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"Allow\",\"Deny\"]'"
	 * @generated
	 */
	Integer getDefaultZoningState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneService#getDefaultZoningState <em>Default Zoning State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Zoning State</em>' attribute.
	 * @see #getDefaultZoningState()
	 * @generated
	 */
	void setDefaultZoningState(Integer value);

	/**
	 * Returns the value of the '<em><b>Configuration ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConfigurationID is the unique identifier that is used to determine whether the underlying zoning configuration has changed. For example, the ConfigurationID can be a checksum, date and time, sequence identification, as long as it unque to the client accessing the property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration ID</em>' attribute.
	 * @see #setConfigurationID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneService_ConfigurationID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getConfigurationID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneService#getConfigurationID <em>Configuration ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration ID</em>' attribute.
	 * @see #getConfigurationID()
	 * @generated
	 */
	void setConfigurationID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method creates a ZoneSet and the association HostedCollection. The newly created association, HostedCollection, associates the Zone to the same AdminDomain that the ZoneService is hosted to. For the newly created ZoneSet, the Active property is always set to false. 
	 * 
	 * This method might be deprecated in the future in lieu of intrinsics after limitations in the CIM Operations are addressed.
	 * @param ZoneSetName A user-friendly name for the ZoneSet that is unique within the AdminDomain.
	 * @param ZoneSet A reference to the newly created Zone.
	 * <!-- end-model-doc -->
	 * @model ZoneSetNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_ZoneSet.ElementName\"]'" ZoneSetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ZoneSet REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Already_Exists\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long CreateZoneSet(String ZoneSetName, CIM_ZoneSet ZoneSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method creates a Zone and the association HostedCollection. The newly created association, HostedCollection, associates the Zone to the same AdminDomain that the ZoneService is hosted to. For the newly created Zone, the Active property is always set to false. 
	 * 
	 * This method might be deprecated in the future in lieu of intrinsics after limitations in the CIM Operations are addressed.
	 * @param ZoneName A user-friendly name for the Zone that is unique within the AdminDomain.
	 * @param ZoneType The type of zoning to be enforced.
	 * @param ZoneSubType Specific clarification to be used when the ZoneType has an enumeration that requires it. Specifically, if ZoneType is "Protocol", then SubType is the Fibre Channel FC4 type.
	 * @param Zone A reference to the newly created Zone.
	 * <!-- end-model-doc -->
	 * @model ZoneNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_Zone.ElementName\"]'" ZoneTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"Default\",\"Protocol\",\"Peer User\",\"Peer Target\"]' ModelCorrespondence='[\"CIM_Zone.ZoneType\"]'" ZoneSubTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"SCSI\",\"VI\",\"IP\"]' ModelCorrespondence='[\"CIM_Zone.ZoneSubType\"]'" ZoneAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Zone REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Already_Exists\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long CreateZone(String ZoneName, Integer ZoneType, Integer ZoneSubType, CIM_Zone Zone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method creates a ZoneAlias and the association HostedCollection. The newly created association, HostedCollection, associates the ZoneAlias to the same AdminDomain that the ZoneService is hosted to. For the newly created ZoneAlias, the Active property is always set to false. 
	 * 
	 * This method might be deprecated in the future in lieu of intrinsics after limitations in the CIM Operations are addressed.
	 * @param CollectionAlias A name (alias) for the ZoneAlias that is unique in the context of the hosting System.
	 * @param ZoneAlias A reference to the newly created ZoneAlias.
	 * <!-- end-model-doc -->
	 * @model CollectionAliasAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'" ZoneAliasAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NamedAddressCollection REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Already_Exists\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long CreateZoneAlias(String CollectionAlias, CIM_NamedAddressCollection ZoneAlias);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreateZoneMembershipSettingData creates a ZoneMembershipSettingData and adds it to the specified Zone or ZoneAlias by creating a MemberOfCollection association. 
	 * 
	 * This method might be deprecated in the future in lieu of intrinsics after limitations in the CIM Operations are addressed.
	 * @param ConnectivityMemberType Identifies the type of identification placed in ConnectivityMemberID.
	 * @param ConnectivityMemberID
	 *   This property specifies the type of identification used in the ConnectivityMemberID field. For Fibre Channel: 
	 *   * A ConnectivityMemberType of 'PermanentAddress', the ConnectivityMemberID is the NxPort WWN; 
	 *   * A ConnectivityMemberType of 'NetworkAddress', the ConnectivityMemberID is the NXPort Address ID; 
	 *   * A ConnectivityMemberType of 'SwitchPortID', the ConnectivityMemberID is 'Domain:PortNumber'.
	 * @param SystemSpecificCollection The collection that the ZoneMembershipSettingData should be added to. The collection is either a Zone or ZoneAlias.
	 * @param ZoneMembershipSettingData A reference to the newly created ZoneMembershipSettingData.
	 * <!-- end-model-doc -->
	 * @model ConnectivityMemberTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"PermanentAddress\",\"NetworkAddress\",\"SwitchPortID\",\"LogicalPortGroup\",\"DMTF_Reserved\",\"Vendor_Reserved\"]'" ConnectivityMemberIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_ZoneMembershipSettingData.ConnectivityMemberID\"]'" SystemSpecificCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SystemSpecificCollection REF' Required='true'" ZoneMembershipSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ZoneMembershipSettingData REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Already_Exists\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long CreateZoneMembershipSettingData(Integer ConnectivityMemberType, String ConnectivityMemberID, CIM_SystemSpecificCollection SystemSpecificCollection, CIM_ZoneMembershipSettingData ZoneMembershipSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds to the ZoneSet the specified Zone. Adding a Zone to a ZoneSet, extends the zone enforcement definition of the ZoneSet to include the members of that Zone. If adding the Zone is successful, the Zone should be associated with the ZoneSet by MemberOfCollection. 
	 * 
	 * This method might be deprecated in the future in lieu of intrinsics after limitations in the CIM Operations are addressed.
	 * @param ZoneSet A reference to the ZoneSet that the Zone is added to.
	 * @param Zone A reference to the Zone that is to be added to the ZoneSet.
	 * <!-- end-model-doc -->
	 * @model ZoneSetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ZoneSet REF' Required='true'" ZoneAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Zone REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Already_Exists\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long AddZone(CIM_ZoneSet ZoneSet, CIM_Zone Zone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds to the Zone or ZoneAlias, the specified ZoneMembershipSettingData. If adding the ZoneMembershipSettingData is successful, an ElementSettingData association will be created between the ZoneMembershipSettingData and either the Zone or ZoneAlias. 
	 * 
	 * This method might be deprecated in the future in lieu of intrinsics after limitations in the CIM Operations are addressed.
	 * @param SystemSpecificCollection A reference to the Zone or ZoneAlias that the ZoneMembershipSettingData is to be added to.
	 * @param ZoneMembershipSettingData A reference to the ZoneMembershipSettingData that is to be added to the Zone or ZoneAlias.
	 * <!-- end-model-doc -->
	 * @model SystemSpecificCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SystemSpecificCollection REF' Required='true'" ZoneMembershipSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ZoneMembershipSettingData REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Already_Exists\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long AddZoneMembershipSettingData(CIM_SystemSpecificCollection SystemSpecificCollection, CIM_ZoneMembershipSettingData ZoneMembershipSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds to the Zone the specified ZoneAlias. 
	 * 
	 * This method might be deprecated in the future in lieu of intrinsics after limitations in the CIM Operations are addressed.
	 * @param Zone A reference to the Zone that the ZoneAlias is to be added to.
	 * @param ZoneAlias A reference to the ZoneAlias that is to be added to the Zone.
	 * <!-- end-model-doc -->
	 * @model ZoneAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Zone REF' Required='true'" ZoneAliasAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NamedAddressCollection REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Already_Exists\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long AddZoneAlias(CIM_Zone Zone, CIM_NamedAddressCollection ZoneAlias);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activates the specified ZoneSet. After the ZoneSet is activated, the ZoneSet, associated Zone, ZoneAliases, and ZoneMembershipSettingData instances will have the active flag set to true. 
	 * 
	 * This method might be deprecated in the future in lieu of intrinsics after limitations in the CIM Operations are addressed.
	 * @param ZoneSet A reference to the ZoneSet to be activated.
	 * @param Activate Activate indicates whether the references to ZoneSet should be activated (Active=true) or deactivated (Active=false).
	 * <!-- end-model-doc -->
	 * @model ZoneSetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ZoneSet REF' Required='true'" ActivateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long ActivateZoneSet(CIM_ZoneSet ZoneSet, Boolean Activate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SessionControl requests that a session start (value=2), end (value=3), or terminate (value=4).
	 * @param RequestedSessionState RequestedSessionState is an integer enumeration that indicates whether the ZoneService session has been requested to start (value=2), end (value=3), or terminate (value=4).
	 * <!-- end-model-doc -->
	 * @model RequestedSessionStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Start\",\"End\",\"Terminate\"]' ModelCorrespondence='[\"CIM_ZoneService.RequestedSessionState\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"9\",\"10..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Insufficient_Resources\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long SessionControl(Integer RequestedSessionState);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activates the specified ZoneSet with the expectation that a job will be created. It has an optional input, ConfigurationID, which is used to confirm that the ZoneSet being activated matches the definition the client previously discovered. If the input ConfigurationID matches, then the method attempts to activate the ZoneSet. If the ConfigurationIDs do not match, the method exits without activating the ZoneSet. After the ZoneSet is activated, the ZoneSet, associated Zone, ZoneAliases, and ZoneMembershipSettingData instances will have the active flag set to true. 
	 * 
	 * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob is started to perform the activation. The Job's reference will be returned in the output parameter Job.
	 * @param ZoneSet A reference to the ZoneSet to be activated.
	 * @param Activate Activate indicates whether the references to ZoneSet should be activated (Active=true) or deactivated (Active=false).
	 * @param ConfigurationID ConfigurationID is the expected identifier of the underlying zoning configuration.
	 * @param Job Reference to the job (can be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model ZoneSetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ZoneSet REF' Required='true'" ActivateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'" ConfigurationIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"9\",\"10\",\"..\",\"4096\",\"0x1001..0x7777\",\"0x8000..0xFFFF\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Not_Found\",\"Insufficient_Resources\",\"ConfigurationIDMismatch\",\"DMTF_Reserved\",\"Method Parameters Checked - Job Started\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long ActivateZoneSetWithJob(CIM_ZoneSet ZoneSet, Boolean Activate, String ConfigurationID, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SessionControl requests that a session start (value=2), end (value=3), or terminate (value=4). It has an optional input, ConfigurationID, which is used to confirm that the session being locked matches the definition the client previously discovered. If the input ConfigurationID matches, then the method attempts to start the session. If the ConfigurationIDs do not match, the method exits without actstarting the session.
	 * 
	 * When a session is ended (value=3), the expectation is that a job will be created.If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob is started to end the session. The Job's reference will be returned in the output parameter Job.
	 * @param RequestedSessionState RequestedSessionState is an integer enumeration that indicates whether the ZoneService session has been requested to start (value=2), end (value=3), or terminate (value=4).
	 * @param ConfigurationID ConfigurationID is the expected identifier of the underlying zoning configuration.
	 * @param Job Reference to the job (can be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model RequestedSessionStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Start\",\"End\",\"Terminate\"]' ModelCorrespondence='[\"CIM_ZoneService.RequestedSessionState\"]'" ConfigurationIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"9\",\"10\",\"..\",\"0x1000..0x7777\",\"0x8000..0xFFFF\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access_Denied\",\"Insufficient_Resources\",\"ConfigurationIDMismatch\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]'"
	 * @generated
	 */
	Long SessionControlWithJob(Integer RequestedSessionState, String ConfigurationID, CIM_ConcreteJob Job);

} // CIM_ZoneService
