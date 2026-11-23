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
 * A representation of the model object '<em><b>CIM Indication Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IndicationSubscription()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.16.0' UMLPackagePath='CIM::Event' override.Filter='CIM_IndicationFilter REF' override.Filter.Key='true' override.Filter.Description='The Filter that defines the criteria and data of the possible Indications of this subscription.' override.Handler='CIM_ListenerDestination REF' override.Handler.Key='true' override.Handler.Description='The Handler addressing delivery of the possible Indications of this subscription.' keys='Filter,Handler'"
 * @generated
 */
@ProviderType
public interface CIM_IndicationSubscription extends CIM_AbstractIndicationSubscription {
} // CIM_IndicationSubscription
