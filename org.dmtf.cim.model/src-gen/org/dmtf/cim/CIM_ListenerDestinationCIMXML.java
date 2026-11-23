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
 * A representation of the model object '<em><b>CIM Listener Destination CIMXML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ListenerDestinationCIMXML describes the destination for CIM Export Messages to be delivered via CIM-XML.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ListenerDestinationCIMXML()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Event' override.Destination='string' override.Destination.Required='true' override.Destination.Description='The destination URL to which CIM-XML Export Messages are to be delivered.The scheme prefix MUST be consistent with the DMTF CIM-XML specifications.If a scheme prefix is not specified, the scheme \"http:\" MUST be assumed.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ListenerDestinationCIMXML extends CIM_ListenerDestination {
} // CIM_ListenerDestinationCIMXML
