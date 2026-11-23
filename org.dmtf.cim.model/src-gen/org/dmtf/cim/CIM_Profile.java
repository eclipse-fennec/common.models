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
 * A representation of the model object '<em><b>CIM Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of CIM_Profile is deprecated in favor of aggregating instances of Setting or SettingData into "higher-level" Settings or SettingData objects using the ConcreteComponent association. This use simplifies the use of Settings or SettingData. With Profiles subclassing from Collection, separate associations were needed between an element and either its Profiles or Settings or SettingData. This class introduced unnecessary complexity and redundancy into the model. 
 * Deprecated description: Profile specifies a general collection of Settings or SettingData objects that are logically grouped together. Note: The CIM_Profile class uses simplified naming or identity algorithms and collection algorithms, as compared to CIM_Configuration. The settings are "collected" into the Profile using the MemberOfCollection association. Note that a Profile obtains its setting data and other necessary information from collected Setting and SettingData instances and by the definition of additional properties in subclasses. One example of a Profile is to define the collection of settings for a particular person. Another is to define the collection of settings that are appropriate when initializing a system. 
 * Profile is tied to a ManagedElement using the ElementProfile association. The ManagedElement provides the context for the Profile, and the settings collected by Profile should be settings of the associated ManagedElement. Note that a ManagedElement cannot exist when the Profile is instantiated. This situation is important to remember when the Profile is used in the creation of the real-world entity that is represented by (and then instantiated in) the ManagedElement.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Profile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_SettingData\",\"CIM_Setting\",\"CIM_ConcreteComponent\"]' Version='2.19.0' UMLPackagePath='CIM::Core::Settings' override.InstanceID='string' override.InstanceID.Deprecated='[\"CIM_SettingData.InstanceID\",\"CIM_Setting.SettingID\"]' override.InstanceID.Key='true' override.InstanceID.Description='Note: The use of this element is deprecated. Deprecated description: Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs that are produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the preferred algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_Profile extends CIM_Collection {
} // CIM_Profile
