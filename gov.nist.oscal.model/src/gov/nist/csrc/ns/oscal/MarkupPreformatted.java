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
package gov.nist.csrc.ns.oscal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Preformatted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The content model is the same as inlineMarkupType, but line endings need
 *             to be preserved, since this is pre-formatted.
 * <!-- end-model-doc -->
 *
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupPreformatted()
 * @model extendedMetaData="name='preformattedType' kind='mixed'"
 * @generated
 */
@ProviderType
public interface MarkupPreformatted extends InlineMarkup {
} // MarkupPreformatted
