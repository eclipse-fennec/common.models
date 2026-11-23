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
 * A representation of the model object '<em><b>CIM Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Share is representative of an object presented for use (or shared) across systems. Instances of CIM_Share are associated with the shared object on the 'server'-side via the CIM_SharedElement association. Shares are mounted on the 'client'-side (usually into another namespace) via the CIM_Import Share association. CIM_Share is Abstract to force subclassing to define the semantics of sharing.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Share()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.43.0' UMLPackagePath='CIM::System::FileElements' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n\n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_Share extends CIM_EnabledLogicalElement {
} // CIM_Share
